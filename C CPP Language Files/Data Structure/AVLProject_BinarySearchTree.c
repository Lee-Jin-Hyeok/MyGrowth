#include <stdio.h>
#include <stdlib.h>
#include "BinaryTree.h"
#include "BinarySearchTree.h"
#include "AVLRebalance.h"

#define REF_TEXTBOOK	

void BSTMakeAndInit(BTreeNode** pRoot)
{
	*pRoot = NULL;
}

BSTData BSTGetNodeData(BTreeNode* bst)
{
	return GetData(bst);
}

void BSTInsert(BTreeNode * *pRoot, BSTData data)
{
	BTreeNode* newNode, * p = *pRoot, * parent = NULL;

	while (p != NULL) {
		parent = p;
		if (p->data == data) {
			printf("\nKey[%d] exists.\n", data);
			return;
		}
		else if (p->data > data) p = p->left;
		else p = p->right;
	}

	if (p == NULL) {
		newNode = MakeBTreeNode();
		SetData(newNode, data);
		if (parent == NULL) * pRoot = newNode;
		else {
			if (parent->data < data) parent->right = newNode;
			else parent->left = newNode;
		}
	}
}

void AVLInsert(BTreeNode **pRoot, BSTData data)
{
	BTreeNode* newNode, * p = *pRoot, * parent = NULL;

	while (p != NULL) {
		parent = p;
		if (p->data == data) {
			printf("\nKey[%d] exists.\n", data);
			return;
		}
		else if (p->data > data) p = p->left;
		else p = p->right;
	}

	if (p == NULL) {
		newNode = MakeBTreeNode();
		SetData(newNode, data);
		if (parent == NULL) * pRoot = newNode;
		else {
			if (parent->data < data) parent->right = newNode;
			else parent->left = newNode;
		}
	}
	printf("[%d]»ğÀÔ ÈÄ recursiveRebalance ÁøÇà  \n", data);
	*pRoot = recursiveRebalance(pRoot);
}

BTreeNode* BSTSearch(BTreeNode * bst, BSTData target)
{
	BTreeNode* cNode = bst;

	if (cNode == NULL)
		return NULL;

	if (cNode->data == target)
		return cNode;
	else if (cNode->data < target)
		BSTSearch(cNode->right, target);
	else
		BSTSearch(cNode->left, target);

}

BTreeNode* BSTRemove(BTreeNode * *pRoot, BSTData target)
{
	BTreeNode* parent, * p, * succ, * succ_parent;
	BTreeNode* child;
	BTreeNode* dNode;
	dNode = MakeBTreeNode();

	parent = NULL;
	p = *pRoot;

	while ((p != NULL) && (p->data != target)) {
		parent = p;
		if (target < p->data) p = p->left;
		else p = p->right;
	}


	if (p == NULL) {
		printf("\n[Key : %d] is not existed !!\n\n", target);
		SetData(dNode, target);
		return dNode;
	}
	else {
		SetData(dNode, p->data);
	}

	if ((p->left == NULL) && (p->right == NULL)) {
		if (parent != NULL) {
			if (parent->left == p) parent->left = NULL;
			else parent->right = NULL;
		}
		else *pRoot = NULL;
	}

	else if ((p->left == NULL) || (p->right == NULL)) {
		if (p->left != NULL) child = p->left;
		else child = p->right;

		if (parent != NULL) {
			if (parent->left == p) parent->left = child;
			else parent->right = child;
		}
		else *pRoot = child;
	}

	else {
		succ_parent = p;
		succ = p->right;
		while (succ->left != NULL) {
			succ_parent = succ;
			succ = succ->left;
		}
		p->data = succ->data;
		if (succ_parent->left == succ)  succ_parent->left = succ->right;
		else succ_parent->right = succ->right;
		p = succ;

	}
	free(p);

	return dNode;
}

BTreeNode* AVLRemove(BTreeNode * *pRoot, BSTData target)
{
	BTreeNode* parent, * p, * succ, * succ_parent;
	BTreeNode* child;
	BTreeNode* dNode;

	dNode = MakeBTreeNode();

	parent = NULL;
	p = *pRoot;

	while ((p != NULL) && (p->data != target)) {
		parent = p;
		if (target < p->data) p = p->left;
		else p = p->right;
	}


	if (p == NULL) {
		printf("\n[Key : %d] is not existed !!\n\n", target);
		SetData(dNode, target);

		return dNode;
	}
	else {
		SetData(dNode, p->data);
	}

	if ((p->left == NULL) && (p->right == NULL)) {
		if (parent != NULL) {
			if (parent->left == p) parent->left = NULL;
			else parent->right = NULL;
		}
		else *pRoot = NULL;
	}

	else if ((p->left == NULL) || (p->right == NULL)) {
		if (p->left != NULL) child = p->left;
		else child = p->right;

		if (parent != NULL) {
			if (parent->left == p) parent->left = child;
			else parent->right = child;
		}
		else *pRoot = child;
	}

	else {
		succ_parent = p;
		succ = p->right;
		while (succ->left != NULL) {
			succ_parent = succ;
			succ = succ->left;
		}
		p->data = succ->data;
		if (succ_parent->left == succ)  succ_parent->left = succ->right;
		else succ_parent->right = succ->right;
		p = succ;

	}
	free(p);
	*pRoot = recursiveRebalance(pRoot);

	return dNode;
}

void ShowIntData(int data)
{
	printf("%d ", data);
}

void BSTShowAll(BTreeNode * bst, char* szTitle)
{
	printf("Inorder Traversal[%s] : ", szTitle);
	InorderTraverse(bst, ShowIntData);
	printf("\n\n");
}


BTreeNode* FindMax(BTreeNode * T) {
	if (T == NULL) return NULL;
	else if (T->left == NULL) return FindMax(T->right);
	else return T;
}


BTreeNode * FindMin(BTreeNode * T) {
	if (T == NULL) return NULL;
	else if (T->left == NULL) return T;
	else return FindMin(T->left);
}