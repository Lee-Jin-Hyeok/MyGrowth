#include <stdio.h>
#include <stdlib.h>
#include "TreeLinkedList.h"

void TreeFree(Node* nd) {
	if (nd == NULL)
		return;
	TreeFree(nd->left);
	TreeFree(nd->right);
	free(nd);
	printf("Free ¿Ï·á\n");
}

Node* MakeTreeNode() {
	Node* nd = (Node*)malloc(sizeof(Node));
	nd->left = NULL;
	nd->right = NULL;
	return nd;
}

Data GetNode(Node * nd) {
	return nd->data;
}

void SetNode(Node * nd, Data data) {
	nd->data = data;
}

Node* GetLeftSubTree(Node * nd) {
	return nd->left;
}

Node* GetRightSubTree(Node * nd) {
	return nd->right;
}

void MakeLeftSubTree(Node * nd, Node * sub) {
	if (nd->left != NULL)
		TreeFree(nd->left);

	nd->left = sub;
}

void MakeRightSubTree(Node * nd, Node * sub) {
	if (nd->right != NULL)
		TreeFree(nd->right);

	nd->right = sub;
}

void InorderTraverse(Node * nd) {
	if (nd == NULL)
		return;
	InorderTraverse(nd->left);
	printf("%c ", nd->data);
	InorderTraverse(nd->right);
}

void PreorderTraverse(Node * nd) {
	if (nd == NULL)
		return;
	printf("%c ", nd->data);
	PreorderTraverse(nd->left);
	PreorderTraverse(nd->right);
}

void PostorderTraverse(Node * nd) {
	if (nd == NULL)
		return;
	PostorderTraverse(nd->left);
	PostorderTraverse(nd->right);
	printf("%c ", nd->data);
}