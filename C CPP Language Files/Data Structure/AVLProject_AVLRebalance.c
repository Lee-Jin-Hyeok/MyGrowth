#include <stdio.h>
#include <math.h>
#include "BinaryTree.h"
#include "AVLRebalance.h"

// LL 회전
BTreeNode* rotateLL(BTreeNode* pNode) {
	BTreeNode* cNode = pNode->left;
	pNode->left = cNode->right;
	cNode->right = pNode;
	
	return cNode;
}

// RR 회전
BTreeNode* rotateRR(BTreeNode* pNode) {
	BTreeNode* cNode = pNode->right;
	pNode->right = cNode->left;
	cNode->left = pNode;

	return cNode;
}

// RL 회전
BTreeNode* rotateRL(BTreeNode* pNode) {
	BTreeNode* cNode = pNode->right;
	pNode->right = cNode->left;
	cNode->left = pNode->right->right;
	pNode->right->right = cNode;
	rotateRR(pNode);
}

// LR 회전
BTreeNode* rotateLR(BTreeNode* pNode) {
	BTreeNode* cNode = pNode->left;
	pNode->left = cNode->right;
	cNode->right = pNode->left->left;
	pNode->left->left = cNode;
	rotateLL(pNode);
}

// 트리의 높이를 계산하여 반환
int getHeight(BTreeNode* bst) {
	int left = -1;
	int right = -1;

	if (bst->left != NULL)
		left = getHeight(bst->left);
	if (bst->right != NULL)
		right = getHeight(bst->right);

	return (left > right) ? left + 1: right + 1;
}

// 두 서브 트리의 높이의 차 BF(균형인수)를 반환
int getHeightDiff(BTreeNode* bst) {
	int leftHeight = getHeight(bst->left);
	int rightHeight = getHeight(bst->right);

	return leftHeight - rightHeight;
}

// BST 트리의 리밸런싱을 위한 함수
BTreeNode* recursiveRebalance(BTreeNode** pRoot) {

	if ((*pRoot)->left != NULL)
		recursiveRebalance((*pRoot)->left);
	else
		rebalance(*pRoot);

	if ((*pRoot)->right != NULL)
		recursiveRebalance((*pRoot)->right);
	else
		rebalance(*pRoot);
}

BTreeNode* rebalance(BTreeNode** pRoot) {
	int balance = getHeightDiff(*pRoot);

	if (balance > 1) {
		if (getHeightDiff((*pRoot)->left) == 1)
			* pRoot = rotateLL(*pRoot);
		else
			*pRoot = rotateLR(*pRoot);
	}
	else if (balance < -1) {
		if (getHeightDiff((*pRoot)->right) == 1)
			* pRoot = rotateRL(*pRoot);
		else
			*pRoot = rotateRR(*pRoot);
	}

	return *pRoot;
}