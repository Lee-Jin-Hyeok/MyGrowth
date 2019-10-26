#include "ArrayStack.h"

void StackInit(Stack* stack) {
	stack->numOfData = 0;
	stack->top = -1;
}

void Push(Stack* stack, Data data) {
	if (isFull(stack)) {
		printf("Stack Overflow\n");
		return;
	}
	(stack->top)++;
	stack->arr[stack->top] = data;
	(stack->numOfData)++;
}

Data Pop(Stack* stack) {
	if (isEmpty(stack)) {
		printf("Stack Underflow\n");
		return -1;
	}
	Data tempData = stack->arr[stack->top];
	(stack->top)--;
	(stack->numOfData)--;
	return tempData;
}

int isEmpty(Stack* stack) {
	if ((stack->numOfData) > 0)
		return FALSE;	// 비어 있지 않다.
	return TRUE;		// 비어 있다.
}

int isFull(Stack* stack) {
	if ((stack->numOfData) >= ARRAY_LENGTH)
		return TRUE;
	return FALSE;
}

int Count(Stack* stack) {
	return stack->numOfData;
}