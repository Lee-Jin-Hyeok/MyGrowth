#include <stdio.h>
#include <stdlib.h>
#include "BinaryTree.h"

BTreeNode* BSTSearch(BTreeNode * bt, BTData data) {
	if (bt == NULL) {
		printf("404 Not Found Exception\n");
		return NULL;
	}
	
	if (bt->data == data)
		return bt;
	else if (bt->data < data)
		BSTSearch(bt->left, data); 
	else
		BSTSearch(bt->right, data);
}

void BSTInsert(BTreeNode * bt, BTreeNode * sub) {
	if (bt == NULL) {
		bt = MakeBTreeNode();
		SetData(bt, sub->data);
		return;
	}

	if (bt->data > sub->data) {
		if (bt->left == NULL) {
			MakeLeftSubTree(bt, sub);
			return;
		}
		BSTInsert(bt->left, sub);
	}
	else {
		if (bt->right == NULL) {
			MakeRightSubTree(bt, sub);
			return;
		}
		BSTInsert(bt->right, sub);
	}
}

void ShowIntData(int data) {
	printf("%d ", data);
}