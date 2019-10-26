#include <stdio.h>
#include "ArrayStack.h"

int main() {
	Stack stack;
	StackInit(&stack);

	Push(&stack, 1);
	Push(&stack, 2);

	printf("%d ", Pop(&stack));
	printf("%d ", Pop(&stack));

	return 0;
}