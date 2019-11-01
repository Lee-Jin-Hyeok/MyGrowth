#include "HanoiTower.h"

int main() {
	int n;

	printf("초기원반의 갯수를 입력하세요.\n");
	scanf("%d", &n);
	HanoiInit(n);

	printf("-----------------------초기상태-----------------------\n");
	printf("Stack 1 | ");
	FindAll(stack1);
	printf("Stack 2 | ");
	FindAll(stack2);
	printf("Stack 3 | ");
	FindAll(stack3);
	printf("------------------------------------------------------\n");

	Hanoi(n, stack1, stack2, stack3);

	return 0;
}