/*
	파일명 TreeLinkedListMain.c
	제작자 이진혁
	내용 {
		C언어를 이용해서 Tree를 일부 구현한 코드입니다.
		TreeLinkedList.c , TreeLinkedList.h 와 관련이 있습니다.

		본 코드에서는 7 * (3 + 5) / 2 + 4 * 8 라는 수식을
		트리로 구현하고 중위순회, 전위순회, 후위순회를 통하여
		트리의 값을 구해보는 과정을 담았습니다.
	}
*/

#include <stdio.h>
#include <stdlib.h>
#include "TreeLinkedList.h"

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