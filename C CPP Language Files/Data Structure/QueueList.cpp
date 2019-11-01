/*
	���ϸ� QueueList.cpp
	������ ������
	���� {
		Queue ������ �ڷᱸ���� LinkedList �������� ������ �ڵ��̴�.
		����� �Ʒ��� ����.
		ListInit - List�� �ʱ�ȭ�Ѵ�.
		Insert - List�� new Node�� �߰��Ѵ�.
		FindAll - List�� Queue ���Ĵ�� ����ϵ�, ���� ������ ���� �ƴϴ�.
		Remove - List�� Queue ���Ĵ�� Data�� return �Ѵ�.
		isEmpty - Queue�� ����ִ��� Ȯ���ϰ� ��������� 1 ������� ������ 0�� return �Ѵ�.
		Count - List���� Node ������ return �Ѵ�.

		Queue�� ���Լ����� ���·� ���� ���� ���� ���� ���� ���� ������ �ڷ� �����̴�.
	}

	*���� : �������� �𸣰����� C������ ����������� �ұ��ϰ� .cpp ���Ͽ��� .c ���Ϸ� �ٲ� �� ������ �߻��Ѵ�.
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