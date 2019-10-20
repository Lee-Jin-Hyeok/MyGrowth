#ifndef __HANOI_STACK_H__
#define __HANOI_STACK_H__

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TRUE 1
#define FALSE 0

typedef int Data;

typedef struct _node {
	struct _node* next;
	Data data;
} Node;

typedef struct _hanoiStack {
	Node* head;
	Node* temp;
	int numOfData;
} HanoiStack;

typedef HanoiStack Stack;

void StackInit(Stack*);
void Insert(Stack*, Data);
void FindAll(Stack*);
Data Remove(Stack*);
int isEmpty(Stack*);
int Count(Stack*);

#endif