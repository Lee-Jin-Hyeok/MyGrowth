/*
	파일명 PolynormialLikedList.cpp
	제작자 이진혁
	내용 {
		다항식의 한 항을 데이터로 하여 Node에 저장할 수 있는 LikedList를 새로 만들어서,
		두 개의 다항식을 더하는 프로그램을 만들어보자.

		item1 배열의 수들은 { a1, b1, a2, b2, a3, b3 ... } 과 같은 형식으로 들어가 있는데,
		이는 a1^b1 + a2^b2 ... 와 같은 형식을 띄고 있는 다항식인 것이다.
		bn이 0일 경우 상수항으로 취급하며, 계수가 0인 항은 삭제한다.

		한계점 - item1 배열과 item2 배열에 지수가 같은 항을 넣으면 계산하지만
				한 배열에 같은 지수를 가진 항이 두 개 이상 있으면 계산하지 못한다.
				예를 들어, item1 = { 1 , 1 , 2 , 2 , 3 , 2 }, item2 = { 1 , 3 , 2 , 4 }; 과 같은 경우에
				item1에 있는 2의2승과 3의2승을 계산하지 못한다.
	}

	*주의 : 왜인지는 모르겠지만 C문법만 사용했음에도 불구하고 .cpp 파일에서 .c 파일로 바꿀 시 오류가 발생한다.
*/

#include <stdio.h>
#include <stdlib.h>
#define array_number 50
#define true 1
#define false 0

typedef int data;

typedef struct _node {
	_node* next;
	data cdata;
	data idata;
} node;

typedef struct _polynomiallinkedlist {
	node* head;
	node* cur;
	node* before;
	int numofdata;
	int (*comp)(data d1, data d2);
} polynomiallinkedlist;

typedef polynomiallinkedlist list;

void listinit(list*);
void insert(list*, data, data);
void print(list*);
int isfirst(list*);
data remove(list*);
int count(list*);
int rule(data, data);
void setsortrule(list*, int (*comp)(data d1, data d2));
list* merge(list*, list*);

int main() {
	int item1[array_number] = { 3, 1, 4, 7, 5, 5, 3, 10, 4, 9, 5, 12, 6, 13, 7, 14, 4, 0, 0, -1 };
	int item2[array_number] = { -2, 4, -5, 1, 3, 7, -5, 5, 13, 11, 5, 0, 0,-1 };

	list* list1 = (list*)malloc(sizeof(list));
	list* list2 = (list*)malloc(sizeof(list));

	listinit(list1);
	listinit(list2);
	setsortrule(list1, rule);
	setsortrule(list2, rule);

	for (int i = 0; item1[i]; i += 2) insert(list1, item1[i], item1[i + 1]);
	for (int i = 0; item2[i]; i += 2) insert(list2, item2[i], item2[i + 1]);
	printf("다항식 1 출력...\n");
	print(list1);
	printf("다항식 2 출력...\n");
	print(list2);

	list * list3 = merge(list1, list2);
	printf("다항식 합 출력...\n");
	print(list3);

	return 0;
}

void listinit(list * list) {
	list->before = NULL;
	list->cur = NULL;
	list->head = (node*)malloc(sizeof(node));
	list->numofdata = 0;
	list->comp = NULL;
	list->head->next = NULL;
}

void insert(list * list, data cdata, data idata) {
	node* newnode = (node*)malloc(sizeof(node));
	if (isfirst(list)) {
		list->head->next = newnode;
		newnode->next = NULL;
	}
	else {
		list->before = list->head;
		while (list->before->next != NULL && list->comp(idata, list->before->next->idata) != true) {
			list->before = list->before->next;
		}
		newnode->next = list->before->next;
		list->before->next = newnode;
	}
	newnode->idata = idata;
	newnode->cdata = cdata;
	(list->numofdata)++;
}

void print(list * list) {
	for (list->cur = list->head->next; list->cur != NULL; list->cur = list->cur->next) {
		printf("[%d, %d] ", list->cur->cdata, list->cur->idata);
	}
	printf("\n");
}

list* merge(list * list1, list * list2) {
	list* list3 = (list*)malloc(sizeof(list));
	listinit(list3);
	setsortrule(list3, rule);

	list1->cur = list1->head->next;
	list2->cur = list2->head->next;
	list3->cur = list3->head;

	while (list1->cur != NULL || list2->cur != NULL) {
		node* newnode = (node*)malloc(sizeof(node));
		newnode->next = NULL;
		if ((list1->comp(list1->cur->idata, list2->cur->idata)) == -1) {
			if (list1->cur->cdata + list2->cur->cdata == 0) {
				free(newnode);
				list1->cur = list1->cur->next;
				list2->cur = list2->cur->next;
				continue;
			}
			else {
				newnode->idata = list1->cur->idata;
				newnode->cdata = list1->cur->cdata + list2->cur->cdata;
				list3->cur->next = newnode;
				list1->cur = list1->cur->next;
				list2->cur = list2->cur->next;
			}
		}
		else if (list1->comp(list1->cur->idata, list2->cur->idata)) {
			newnode->idata = list1->cur->idata;
			newnode->cdata = list1->cur->cdata;
			list3->cur->next = newnode;
			list1->cur = list1->cur->next;
		}
		else {
			newnode->idata = list2->cur->idata;
			newnode->cdata = list2->cur->cdata;
			list3->cur->next = newnode;
			list2->cur = list2->cur->next;
		}
		list3->cur = list3->cur->next;
	}

	return list3;
}

int count(list * list) {
	return list->numofdata;
}

int isfirst(list * list) {
	if ((list->head->next) == NULL) return true;
	return false;
}

int rule(data d1, data d2) {
	if (d1 > d2) return true;
	else if (d1 < d2) return false;
	else return -1;
}

void setsortrule(list * list, int (*comp)(data d1, data d2)) {
	list->comp = comp;
}