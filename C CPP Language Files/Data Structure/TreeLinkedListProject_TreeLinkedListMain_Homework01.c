#include <stdio.h>
#include <stdlib.h>
#include "TreeLinkedList.h"

int main() {
	Node* tree1 = MakeTreeNode();
	Node* node1 = MakeTreeNode();
	Node* node2 = MakeTreeNode();
	Node* node3 = MakeTreeNode();
	Node* node4 = MakeTreeNode();
	Node* node5 = MakeTreeNode();
	Node* node6 = MakeTreeNode();
	Node* node7 = MakeTreeNode();

	SetNode(tree1, 'A');
	SetNode(node1, 'B');
	SetNode(node2, 'C');
	SetNode(node3, 'D');
	SetNode(node4, 'E');
	SetNode(node5, 'F');
	SetNode(node6, 'G');
	SetNode(node7, 'H');

	MakeLeftSubTree(tree1, node1);
	MakeRightSubTree(tree1, node2);
	MakeLeftSubTree(node1, node3);
	MakeRightSubTree(node1, node4);
	MakeRightSubTree(node2, node5);
	MakeLeftSubTree(node3, node6);
	MakeRightSubTree(node3, node7);

	Node* tree2 = MakeTreeNode();
	Node* node8 = MakeTreeNode();
	Node* node9 = MakeTreeNode();
	Node* node10 = MakeTreeNode();

	SetNode(tree2, 'a');
	SetNode(node8, 'b');
	SetNode(node9, 'c');
	SetNode(node10, 'd');

	MakeLeftSubTree(tree2, node8);
	MakeRightSubTree(tree2, node9);
	MakeRightSubTree(node9, node10);

	printf("\n================================\n");
	printf("Tree1\n");
	printf("================================");
	printf("\n전위 순회 : ");
	PreorderTraverse(tree1);
	printf("\n중위 순회 : ");
	InorderTraverse(tree1);
	printf("\n후위 순회 : ");
	PostorderTraverse(tree1);
	printf("\n================================\n");

	printf("\n================================\n");
	printf("Tree2\n");
	printf("================================");
	printf("\n전위 순회 : ");
	PreorderTraverse(tree2);
	printf("\n중위 순회 : ");
	InorderTraverse(tree2);
	printf("\n후위 순회 : ");
	PostorderTraverse(tree2);
	printf("\n================================\n");

	printf("\n================================\n");
	printf("Tree1의 B대신에 SubTree 삽입\n");
	printf("================================\n");
	MakeLeftSubTree(tree1, tree2);
	printf("\n전위 순회 : ");
	PreorderTraverse(tree1);
	printf("\n중위 순회 : ");
	InorderTraverse(tree1);
	printf("\n후위 순회 : ");
	PostorderTraverse(tree1);
	printf("\n================================\n");

	return 0;
}