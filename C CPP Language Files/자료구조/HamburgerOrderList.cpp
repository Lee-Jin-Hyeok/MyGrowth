#include <stdio.h>
#include <stdlib.h>
#define TRUE 1
#define FALSE 0

typedef int Time;

typedef struct _node {
	Time time;
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
void Enqueue(List*, Time);
Time Dequeue(List*);
void FindAll(List*);
int isEmpty(List*);
int Count(List*);

int main() {

	return 0;
}

void ListInit(List* list) {
	list->front = NULL;
	list->rear = NULL;
	list->temp = NULL;
	list->numOfData = 0;
}

void Enqueue(List* list, Time time) {
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->next = NULL;
}

Time Dequeue(List* list) {

	return 1;
}

void FindAll(List* list) {

}

int isEmpty(List* list) {
	if ((list->numOfData) == 0) {
		return TRUE;	// Empty
	}
	else {
		return FALSE;	// non-Empty
	}
}

int Count(List* list) {
	return list->numOfData;
}