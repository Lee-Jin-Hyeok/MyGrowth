#include "HanoiTower.h"

void HanoiInit(int n) {
	stack1 = (Stack*)malloc(sizeof(Stack));
	stack2 = (Stack*)malloc(sizeof(Stack));
	stack3 = (Stack*)malloc(sizeof(Stack));

	StackInit(stack1);
	StackInit(stack2);
	StackInit(stack3);

	while (n > 0)
		Insert(stack1, n--);
}

void Move(Stack* from, Stack* to) {
	Insert(to, Remove(from));
	printf("------------------------------------------------------\n");
	printf("Stack 1 | ");
	FindAll(stack1);
	printf("Stack 2 | ");
	FindAll(stack2);
	printf("Stack 3 | ");
	FindAll(stack3);
	printf("------------------------------------------------------\n");
}

void Hanoi(int n, Stack* from, Stack* by, Stack* to) {
	if (n == 1)
		Move(from, to);
	else {
		Hanoi(n - 1, from, to, by);
		Move(from, to);
		Hanoi(n - 1, by, from, to);
	}
}