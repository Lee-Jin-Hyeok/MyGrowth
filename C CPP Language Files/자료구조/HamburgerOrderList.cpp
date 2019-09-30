#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TRUE 1
#define FALSE 0
#define WaitingRoom1 50
#define WaitingRoom2 100
#define WaitingRoom3 240
#define WaitingRoom4 1000
#define WaitingRoom5 2500

#define FIRST_HAMBURGER 0
#define SECOND_HAMBURGER 1
#define THREE_HAMBURGER 2

#define FH_TIME 12
#define SH_TIME 15
#define TH_TIME 24

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

int FailCount

int main() {
	List* list = (List*)malloc(sizeof(List));

	ListInit(list);
	srand(time(NULL));

	int FailCounts[5] = { 0, };
	for (int i = 0; i < 100; i++) {
		Time MakingHamburger = 0;
		for (Time sec = 0; sec < 3600; sec++) {
			if (sec % 15 == 0) {
				switch (rand() % 3) {
				case FIRST_HAMBURGER: Enqueue(list, FH_TIME); break;
				case SECOND_HAMBURGER: Enqueue(list, SH_TIME); break;
				case THREE_HAMBURGER: Enqueue(list, TH_TIME); break;
				}
			}
			if (Count(list) > WaitingRoom1) {
				FailCounts[i]++;
				break;
			}
			if (isEmpty(list) && MakingHamburger <= 0) {
				MakingHamburger = Dequeue(list);
			}
			MakingHamburger--;
		}
	}

	printf("1시간동안 대기실이 터질 확률은 %d%%입니다.\n", FailCount);

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
	if (isEmpty(list)) {
		list->front = newNode;
		list->rear = newNode;
	}
	else {
		list->rear->next = newNode;
		list->rear = newNode;
	}
	newNode->time = time;
	(list->numOfData)++;
}

Time Dequeue(List* list) {
	if (isEmpty(list)) {
		return -1;
	}
	Time time = list->front->time;
	Node* t = list->front;
	if ((list->front->next) == NULL) {
		list->front = NULL;
	}
	else {
		list->front = list->front->next;
	}
	free(t);
	(list->numOfData)--;
	return time;
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