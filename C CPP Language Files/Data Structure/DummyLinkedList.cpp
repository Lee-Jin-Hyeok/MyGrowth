/*
	파일명 DummyLinkedList.cpp
	제작자 이진혁
	내용 {
		DummyLinkedList.cpp는 head와 tail이 가리키는 것을 Dummy로 하여 head와 tail이 NULL이 되지 않을 수 있다.
		또한 Insert를 할 때 정렬을 하는 것을 기본으로 하여 모든 데이터가 정렬 되도록 Node가 생성된다.
	}
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define ARRAY_LENGTH 50
#define TRUE 1
#define FALSE 0

typedef int Data;

typedef struct _node {
	Data data;
	struct _node* next;
} Node;

typedef struct _dummyLinkedList {
	Node* head;
	Node* tail;
	Node* temp;
	int numOfData;
} DummyLinkedList;

typedef DummyLinkedList List;

void ListInit(List*);
void Insert(List*, Data);
Data Remove(List*);
void FindAll(List*);
int isEmpty(List*);
int isNext(List*);
int Count(List*);

int main() {

	return 0;
}

void ListInit(List* list) {
	list->head = (Node*)malloc(sizeof(Node));
	list->tail = (Node*)malloc(sizeof(Node));
	list->temp = NULL;
	list->numOfData = 0;
}

void Insert(List* list, Data data) {
	Node* newNode = (Node*)malloc(sizeof(Node));
	while (isNext(list)) {
		
	}
}

Data Remove(List* list) {
	
}

void FindAll(List* list) {

}

int isEmpty(List* list) {
	if (list->numOfData)
		return 0;
	return 1;
}

int Count(List* list) {
	return list->numOfData;
}