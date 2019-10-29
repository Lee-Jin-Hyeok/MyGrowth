#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0
#define ARRAY_LENGTH 10

typedef int Data;

typedef struct _arrayStack {
	int top;
	int numOfData;
	Data arr[ARRAY_LENGTH];
} ArrayStack;

typedef ArrayStack Stack;

void stackInit(Stack*);
void push(Stack*, Data);
Data pop(Stack*);
void stackPrint(Stack* stack);
void print();
int isOverFlow(Stack* stack);
int isUnderFlow(Stack* stack);

Data outdata[100];

int main() {
	int scan_num = 0, i = 0;
	Stack stack;
	stackInit(&stack);

	while (1) {
		stackPrint(&stack);
		printf("output: ");
		print(outdata);
		printf("input: ");
		scanf("%d", &scan_num);
		if (scan_num == 8888) break;
		else if (scan_num == 9999) {
			outdata[i++] = pop(&stack);
		}
		else {
			push(&stack, scan_num);
		}
		printf("\n");
	}
}

void stackInit(Stack* stack) {			// stack�� �ʱ�ȭ �Ѵ�.
	stack->top = -1;
	stack->numOfData = 0;
}

void push(Stack* stack, Data data) {		// stack�� ��Ҹ� �ִ´�.
	if (isOverFlow(stack)) {
		printf("Error: Stack overflow\n");
		return;
	}
	(stack->top)++;
	stack->arr[stack->top] = data;
}

Data pop(Stack* stack) {					// stack�� ����ִ� ��� �ϳ��� ������.
	if (isUnderFlow(stack)) {
		printf("Error: Stack empty\n");
		return 0;
	}
	int data = stack->arr[(stack->top)--];
	return data;
}

void stackPrint(Stack* stack) {				// stack�� ����Ѵ�.
	int cur = stack->top;
	printf("Stack[ ");
	for (int i = 0; i <= cur; i++)
		printf("%d ", stack->arr[i]);
	printf("]\n");
}

void print() {					// outdata�� ���� ����Ѵ�.
	for (int i = 0; i < sizeof(outdata) / sizeof(Data) && !(outdata[i] == 0); i++)
		printf("%d ", outdata[i]);
	printf("\t");
}

int isOverFlow(Stack * stack) {				// overflow�� ������ Ȯ���Ѵ�.
	if ((stack->top) >= ARRAY_LENGTH - 1)
		return 1;	// overflow
	return 0;		// �����۵�
}

int isUnderFlow(Stack * stack) {			// underflow�� ������ Ȯ���Ѵ�.
	if ((stack->top) < 0)
		return 1;	// underflow
	return 0;		// �����۵�
}