#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define ARRAY_LENGTH 3

typedef int Data;

typedef struct _node {
	struct _node* next;
	struct _node* prev;
	Data data;
} Node;

typedef struct _dequeueList {
	Node* head;
	Node* tail;
	Node* temp;
	int numOfData;
} DequeueList;

typedef DequeueList List;

void ListInit(List*);
void HeadInsert(List*, Data);
void TailInsert(List*, Data);
Data HeadRemove(List*);
Data TailRemove(List*);
void HeadFindAll(List*);
void TailFindAll(List*);
int isEmpty(List*);
int Count(List*);

int main() {
	List* list = (List*)malloc(sizeof(List));
	Data data[ARRAY_LENGTH] = { 1, 2, 3 };

	ListInit(list);
	printf("\n[ HeadInsert ]\n");
	for (int i = 0; i < ARRAY_LENGTH; i++) {
		HeadInsert(list, data[i]);
		printf("%0d개 : ", Count(list));
		HeadFindAll(list);
	}
	printf("\n[ TailInsert ]\n");
	for (int i = 0; i < ARRAY_LENGTH; i++) {
		TailInsert(list, data[i]);
		printf("%d개 : ", Count(list));
		HeadFindAll(list);
	}
	printf("\n[ HeadRemove ]\n");
	for (int i = 0; i < ARRAY_LENGTH; i++) {
		HeadRemove(list);
		printf("%d개 : ", Count(list));
		HeadFindAll(list);
	}
	printf("\n[ TailRemove ]\n");
	for (int i = 0; i < ARRAY_LENGTH; i++) {
		TailRemove(list);
		printf("%d개 : ", Count(list));
		HeadFindAll(list);
	}
	printf("%d ", Count(list));
	return 0;
}

void ListInit(List* list) {
	list->head = NULL;
	list->tail = NULL;
	list->temp = NULL;
	list->numOfData = 0;
}

void HeadInsert(List* list, Data data) {
	Node* newNode = (Node*)malloc(sizeof(Node));
	if (isEmpty(list)) {
		list->head = newNode;
		list->tail = newNode;
		list->head->next = NULL;
		list->head->prev = NULL;
		list->tail->next = NULL;
		list->tail->prev = NULL;
	}
	else {
		newNode->prev = NULL;
		newNode->next = list->head;
		list->head->prev = newNode;
		list->head = newNode;
	}
	newNode->data = data;
	(list->numOfData)++;
}

void TailInsert(List* list, Data data) {
	Node* newNode = (Node*)malloc(sizeof(Node));
	if (isEmpty(list)) {
		list->head = newNode;
		list->tail = newNode;
		list->head->next = NULL;
		list->head->prev = NULL;
		list->tail->next = NULL;
		list->tail->prev = NULL;
	}
	else {
		newNode->next = NULL;
		newNode->prev = list->tail;
		list->tail->next = newNode;
		list->tail = newNode;
	}
	newNode->data = data;
	(list->numOfData)++;
}

Data HeadRemove(List* list) {
	if (isEmpty(list)) {
		list->head = NULL;
		list->tail = NULL;
		printf("Empty\n");
		return -1;
	}
	Data data = list->head->data;
	list->head = list->head->next;
	free(list->head->prev);
	list->head->prev = NULL;

	(list->numOfData)--;
	return data;
}

Data TailRemove(List* list) {
	if (isEmpty(list)) {
		list->head = NULL;
		list->tail = NULL;
		printf("Empty\n");
		return -1;
	}
	Data data = list->tail->data;
	list->tail = list->tail->prev;
	free(list->tail->next);
	list->tail->next = NULL;

	(list->numOfData)--;
	return data;
}

void HeadFindAll(List* list) {
	if (isEmpty(list))
		printf("Queue is Empty");
	for (list->temp = list->head; list->temp != NULL; list->temp = list->temp->next)
		printf("%d ", list->temp->data);
	printf("\n");
}

void TailFindAll(List * list) {
	if (isEmpty(list))
		printf("Queue is Empty");
	for (list->temp = list->tail; list->temp != NULL; list->temp = list->temp->prev)
		printf("%d ", list->temp->data);
	printf("\n");
}

int isEmpty(List * list) {
	if (list->numOfData == 0)
		return 1;
	return 0;
}

int Count(List * list) {
	return list->numOfData;
}