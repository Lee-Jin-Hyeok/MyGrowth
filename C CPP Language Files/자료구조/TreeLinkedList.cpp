#include <stdio.h>
#include <stdlib.h>

typedef int Data;

typedef struct _node {
	Data data;
	struct _node* left;
	struct _node* right;
} Node;

Node* MakeTreeNode(void);
Data GetNode(Node*);
Node* GetLeftSubTree(Node*);
Node* GetRightSubTree(Node*);
void MakeLeftSubTree(Node*, Node*);
void MakeRightSubTree(Node*, Node*);
void InorderTraverse(Node*);

int main() {

	return 0;
}

Node* MakeTreeNode() {
	Node* nd = (Node*)malloc(sizeof(Node));
	nd->left = NULL;
	nd->right = NULL;
	return nd;
}

Data GetNode(Node* nd) {
	return nd->data;
}

Node* GetLeftSubTree(Node* nd) {
	return nd->left;
}

Node* GetRightSubTree(Node* nd) {
	return nd->right;
}

void MakeLeftSubTree(Node* nd, Node* sub) {
	if (nd->left != NULL)
		free(nd->left);

	nd->left = sub;
}

void MakeRightSubTree(Node * nd, Node * sub) {
	if (nd->right != NULL)
		free(nd->right);

	nd->right = sub;
}

void InorderTraverse(Node * nd) {
	if (nd == NULL)
		return;
	InorderTraverse(nd->left);
	printf("%d \n", nd->data);
	InorderTraverse(nd->right);
}

void PreorderTraverse(Node * nd) {
	if (nd == NULL)
		return;
	printf("%d \n", nd->data);
	PreorderTraverse(nd->left);
	PreorderTraverse(nd->right);
}

void PostorderTraverse(Node * nd) {
	if (nd == NULL)
		return;
	PostorderTraverse(nd->left);
	PostorderTraverse(nd->right);
	printf("%d \n", nd->data);
}