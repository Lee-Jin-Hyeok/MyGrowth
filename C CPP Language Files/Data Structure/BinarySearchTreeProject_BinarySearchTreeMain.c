#include <stdio.h>
#include "BinarySearchTree.h"

int main() {
	BTreeNode* bt1 = NULL;

	bt1 = BSTInsert(bt1, 60);
	BSTInsert(bt1, 70);
	BSTInsert(bt1, 20);
	BSTInsert(bt1, 40);
	BSTInsert(bt1, 80);
	BSTInsert(bt1, 30);
	BSTInsert(bt1, 100);
	BSTInsert(bt1, 90);
	BSTInsert(bt1, 50);
	BSTInsert(bt1, 10);

	InorderTraverse(bt1, ShowIntData);
	printf("\n\n");

	BSTRemove(bt1, 100);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 90);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 80);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 70);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 50);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 40);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 30);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 20);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 10);
	InorderTraverse(bt1, ShowIntData);
	printf("\n");
	BSTRemove(bt1, 60);

	return 0;
}