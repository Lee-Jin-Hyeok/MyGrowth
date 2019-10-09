/*
	���ϸ� TreeLinkedList.h
	������ ������
	�Լ� ���� :
		TreeFree - node�� node ���� node���� ��� free�Ѵ�.
		MakeTreeNode - �ϳ��� ��带 �����Ѵ�.
		GetNode - node->data�� �����Ѵ�.
		SetNode - node�� data�� �����Ѵ�.
		GetLeftSubTree - �Ű������� ���� node�� left�� �����Ѵ�.
		GetRightSubTree - �Ű������� ���� node�� right�� �����Ѵ�.
		MakeLeftSubTree - �Ű������� ���� node�� left�� node�� free�ϰ� sub Ʈ���� ���� ��ü�Ѵ�.
		MakeRightSubTree - �Ű������� ���� node�� right�� node�� free�ϰ� sub Ʈ���� ���� ��ü�Ѵ�.
		InorderTraverse - ������ȸ�� ���� data���� ����Ѵ�.
		PreorderTraverse - ������ȸ�� ���� data���� ����Ѵ�.
		PostorderTraverse - ������ȸ�� ���� data���� ����Ѵ�.
*/

#ifndef __TreeLinkedList__C__
#define __TreeLinkedList__C__

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

#endif