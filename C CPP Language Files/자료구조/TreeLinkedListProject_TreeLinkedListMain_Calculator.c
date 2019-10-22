/*
	���ϸ� TreeLinkedListMain.c
	������ ������
	���� {
		C�� �̿��ؼ� Tree�� �Ϻ� ������ �ڵ��Դϴ�.
		TreeLinkedList.c , TreeLinkedList.h �� ������ �ֽ��ϴ�.

		�� �ڵ忡���� 7 * (3 + 5) / 2 + 4 * 8 ��� ������
		Ʈ���� �����ϰ� ������ȸ, ������ȸ, ������ȸ�� ���Ͽ�
		Ʈ���� ���� ���غ��� ������ ��ҽ��ϴ�.
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

	printf("���� ��ȸ\n");
	InorderTraverse(node1);
	printf("\n");
	printf("���� ��ȸ\n");
	PreorderTraverse(node1);
	printf("\n");
	printf("���� ��ȸ\n");
	PostorderTraverse(node1);
	printf("\n");

	return 0;
}