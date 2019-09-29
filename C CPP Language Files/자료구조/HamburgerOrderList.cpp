#include <stdio.h>
#include <stdlib.h>

typedef int Data;

typedef struct _node {
	Data data;
	struct _node* next;
} Node;

typedef struct _hamburgerOrderQueueList {
	Node* front;
	Node* rear;
	Node* temp;
	int numOfData;
} HamburgerOrderQueueList;

typedef HamburgerOrderQueueList List;

void ListInit(List*);
void Insert(List*, Data);
void FindAll(List*);
Data Remove(List*);
int isEmpty(List*);
int isNext(List*);

int main() {

	return 0;
}

void ListInit(List* list) {
	list->front = NULL;
	list->rear = NULL;
	list->temp = NULL;
	list->numOfData = 0;
}

void Insert(List* list, Data data) {
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

void FindAll(List* list) {
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