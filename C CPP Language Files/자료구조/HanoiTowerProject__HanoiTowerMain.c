#include "HanoiTower.h"

int main() {
	int n;

	printf("�ʱ������ ������ �Է��ϼ���.\n");
	scanf("%d", &n);
	HanoiInit(n);

	printf("-----------------------�ʱ����-----------------------\n");
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