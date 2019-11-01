/*
	파일명 TreeLinkedList.h
	제작자 이진혁
	함수 정리 :
		TreeFree - node와 node 밑의 node들을 모두 free한다.
		MakeTreeNode - 하나의 노드를 생성한다.
		GetNode - node->data를 리턴한다.
		SetNode - node에 data를 저장한다.
		GetLeftSubTree - 매개변수로 들어온 node의 left를 리턴한다.
		GetRightSubTree - 매개변수를 들어온 node의 right를 리턴한다.
		MakeLeftSubTree - 매개변수로 들어온 node의 left의 node를 free하고 sub 트리의 노드로 교체한다.
		MakeRightSubTree - 매개변수로 들어온 node의 right의 node를 free하고 sub 트리의 노드로 교체한다.
		InorderTraverse - 중위순회로 돌며 data값을 출력한다.
		PreorderTraverse - 전위순회로 돌며 data값을 출력한다.
		PostorderTraverse - 후위순회로 돌며 data값을 출력한다.
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