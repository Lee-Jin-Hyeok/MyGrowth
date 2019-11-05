#include <stdio.h>
#include "BinarySearchTree.h"

int main() {
	BTreeNode* bt1 = MakeBTreeNode();
	BTreeNode* bt2 = MakeBTreeNode();
	BTreeNode* bt3 = MakeBTreeNode();
	BTreeNode* bt4 = MakeBTreeNode();

	SetData(bt1, 10);
	SetData(bt2, 14);
	SetData(bt3, 8);
	SetData(bt4, 11);

	BSTInsert(bt1, bt2);
	BSTInsert(bt1, bt3);
	BSTInsert(bt1, bt4);

	InorderTraverse(bt1, ShowIntData);

	return 0;
}