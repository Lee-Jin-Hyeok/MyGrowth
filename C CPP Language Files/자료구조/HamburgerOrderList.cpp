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
void Insert(List*, Time);
void FindAll(List*);
Time Remove(List*);
int isEmpty(List*);

int main() {

	return 0;
}