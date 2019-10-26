#ifndef __ARRAY_STACK__H__
#define __ARRAY_STACK__H__

#define TRUE 1
#define FALSE 0
#define ARRAY_LENGTH 100

typedef int Data;

typedef struct _arrayStack {
	int top;
	Data arr[ARRAY_LENGTH];
	int numOfData;
} ArrayStack;

typedef ArrayStack Stack;

void StackInit(Stack*);
void Push(Stack*, Data);
Data Pop(Stack*);
int isEmpty(Stack*);
int isFull(Stack*);
int Count(Stack*);

#endif