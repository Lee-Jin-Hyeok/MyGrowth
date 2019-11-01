/*
	파일명 QueueList.cpp
	제작자 이진혁
	내용 {
		Queue 형태의 자료구조를 LinkedList 형식으로 구현한 코드이다.
		기능은 아래와 같다.
		ListInit - List를 초기화한다.
		Insert - List에 new Node를 추가한다.
		FindAll - List를 Queue 형식대로 출력하되, 직접 빼내는 것은 아니다.
		Remove - List를 Queue 형식대로 Data를 return 한다.
		isEmpty - Queue가 비어있는지 확인하고 비어있으면 1 비어있지 않으면 0을 return 한다.
		Count - List안의 Node 갯수를 return 한다.

		Queue는 선입선출의 형태로 가장 먼저 들어가는 것이 가장 먼저 나오는 자료 구조이다.
	}

	*주의 : 왜인지는 모르겠지만 C문법만 사용했음에도 불구하고 .cpp 파일에서 .c 파일로 바꿀 시 오류가 발생한다.
*/


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define ARRAY_LENGTH 100

typedef int Data;

typedef struct _node {
	Data data;
	struct _node* next;
} Node;

typedef struct _queueLinkedList {
	Node* front;
	Node* rear;
	Node* temp;
	int numOfData;
} QueueLinkedList;

typedef QueueLinkedList List;

void ListInit(List*);
void Insert(List*, Data);
void FindAll(List*);
Data Remove(List*);
int isEmpty(List*);
int Count(List*);

int main() {
	List* list = (List*)malloc(sizeof(List));
	Data data[ARRAY_LENGTH] = { 3, 2, 4, 1, 5 };
	printf("------------------\n");
	printf("| QueueList Test |\n");
	printf("------------------\n");

	ListInit(list);
	printf("Insert Start\n");
	for (int i = 0; data[i]; i++) {
		Insert(list, data[i]);
		FindAll(list);
	}
	printf("\n");

	printf("Remove Start\n");
	for (int i = 0; data[i]; i++)
		printf("%d ", Remove(list));
	printf("%d ", Remove(list));
	printf("\n");

	return 0;
}

void ListInit(List * list) {
	list->front = NULL;
	list->rear = NULL;
	list->temp = NULL;
	list->numOfData = 0;
}

void Insert(List * list, Data data) {
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->next = NULL;
	if (isEmpty(list)) {
		list->front = newNode;
		list->rear = newNode;
	}
	else {
		list->rear->next = newNode;
		list->rear = newNode;
	}
	list->rear->data = data;
	(list->numOfData)++;
}

void FindAll(List * list) {
	for (list->temp = list->front; list->temp != list->rear; list->temp = list->temp->next)
		printf("%d ", list->temp->data);
	printf("\n");
}

Data Remove(List * list) {
	Data temp = NULL;
	if (isEmpty(list))
		return -1;
	else if ((list->front) == (list->rear)) {
		temp = list->front->data;
		list->front = NULL;
		list->rear = NULL;
	}
	else {
		temp = list->front->data;
		list->front = list->front->next;
	}
	(list->numOfData)--;
	return temp;
}

int isEmpty(List * list) {
	if (list->numOfData) {
		return 0;
	}
	return 1;
}

int Count(List * list) {
	return list->numOfData;
}