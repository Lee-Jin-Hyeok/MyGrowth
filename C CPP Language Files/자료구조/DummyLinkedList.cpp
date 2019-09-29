/*
	���ϸ� DummyLinkedList.cpp
	������ ������
	���� {
		DummyLinkedList.cpp�� head�� tail�� ����Ű�� ���� Dummy�� �Ͽ� head�� tail�� NULL�� ���� ���� �� �ִ�.
		���� Insert�� �� �� ������ �ϴ� ���� �⺻���� �Ͽ� ��� �����Ͱ� ���� �ǵ��� Node�� �����ȴ�.
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