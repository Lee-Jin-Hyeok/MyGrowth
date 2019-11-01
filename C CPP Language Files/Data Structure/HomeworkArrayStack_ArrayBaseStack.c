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

void stackInit(Stack* stack) {			// stack을 초기화 한다.
	stack->top = -1;
	stack->numOfData = 0;
}

void push(Stack* stack, Data data) {		// stack에 요소를 넣는다.
	if (isOverFlow(stack)) {
		printf("Error: Stack overflow\n");
		return;
	}
	(stack->top)++;
	stack->arr[stack->top] = data;
}

Data pop(Stack* stack) {					// stack에 들어있는 요소 하나를 빼낸다.
	if (isUnderFlow(stack)) {
		printf("Error: Stack empty\n");
		return 0;
	}
	int data = stack->arr[(stack->top)--];
	return data;
}

void stackPrint(Stack* stack) {				// stack을 출력한다.
	int cur = stack->top;
	printf("Stack[ ");
	for (int i = 0; i <= cur; i++)
		printf("%d ", stack->arr[i]);
	printf("]\n");
}

void print() {					// outdata의 값을 출력한다.
	for (int i = 0; i < sizeof(outdata) / sizeof(Data) && !(outdata[i] == 0); i++)
		printf("%d ", outdata[i]);
	printf("\t");
}

int isOverFlow(Stack * stack) {				// overflow가 나는지 확인한다.
	if ((stack->top) >= ARRAY_LENGTH - 1)
		return 1;	// overflow
	return 0;		// 정상작동
}

int isUnderFlow(Stack * stack) {			// underflow가 나는지 확인한다.
	if ((stack->top) < 0)
		return 1;	// underflow
	return 0;		// 정상작동
}