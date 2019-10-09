#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

typedef char Data;

typedef struct _node {
	Data data;
	struct _node* left;
	struct _node* right;
} Node;

void TreeFree(Node*);
Node* MakeTreeNode(void);
Data GetNode(Node*);
void SetNode(Node*, Data);
Node* GetLeftSubTree(Node*);
Node* GetRightSubTree(Node*);
void MakeLeftSubTree(Node*, Node*);
void MakeRightSubTree(Node*, Node*);
void InorderTraverse(Node*);
void PreorderTraverse(Node*);
void PostorderTraverse(Node*);

int main() {
	Node* node1 = MakeTreeNode();
	Node* node2 = MakeTreeNode();
	Node* node3 = MakeTreeNode();
	Node* node4 = MakeTreeNode();
	Node* node5 = MakeTreeNode();
	Node* node6 = MakeTreeNode();
	Node* node7 = MakeTreeNode();
	Node* node8 = MakeTreeNode();
	Node* node9 = MakeTreeNode();
	Node* node10 = MakeTreeNode();
	Node* node11 = MakeTreeNode();

	SetNode(node1, '+');
	SetNode(node2, '/');
	SetNode(node3, '*');
	SetNode(node4, '*');
	SetNode(node5, '2');
	SetNode(node6, '4');
	SetNode(node7, '8');
	SetNode(node8, '7');
	SetNode(node9, '+');
	SetNode(node10, '3');
	SetNode(node11, '5');

	MakeLeftSubTree(node1, node2);
	MakeRightSubTree(node1, node3);
	MakeLeftSubTree(node2, node4);
	MakeRightSubTree(node2, node5);
	MakeLeftSubTree(node3, node6);
	MakeRightSubTree(node3, node7);
	MakeLeftSubTree(node4, node8);
	MakeRightSubTree(node4, node9);
	MakeLeftSubTree(node9, node10);
	MakeRightSubTree(node9, node11);

	printf("중위 순회\n");
	InorderTraverse(node1);
	printf("\n");
	printf("전위 순회\n");
	PreorderTraverse(node1);
	printf("\n");
	printf("후위 순회\n");
	PostorderTraverse(node1);
	printf("\n");

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

void SetNode(Node* nd, Data data) {
	nd->data = data;
}

Node* GetLeftSubTree(Node* nd) {
	return nd->left;
}

Node* GetRightSubTree(Node* nd) {
	return nd->right;
}

void MakeLeftSubTree(Node* nd, Node* sub) {
	if (nd->left != NULL)
		TreeFree(nd->left);

	nd->left = sub;
}

void MakeRightSubTree(Node * nd, Node * sub) {
	if (nd->right != NULL)
		TreeFree(nd->right);

	nd->right = sub;
}

void TreeFree(Node * nd) {
	if (nd == NULL)
		return;
	TreeFree(nd->left);
	TreeFree(nd->right);
	free(nd);
	printf("Free 완료\n");
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