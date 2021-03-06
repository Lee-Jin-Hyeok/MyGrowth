#include <stdio.h>
#include <stdlib.h>
#include "BinaryTree.h"

BTreeNode* BSTSearch(BTreeNode* bt, BTData data) {
	if (bt == NULL) {
		printf("404 Not Found Exception\n");
		return NULL;
	}

	if (bt->data == data)
		return bt;
	else if (bt->data > data)
		BSTSearch(bt->left, data);
	else
		BSTSearch(bt->right, data);
}

BTreeNode* BSTInsert(BTreeNode * bt, BTData data) {
	BTreeNode* newNode;

	if (bt == NULL) {
		newNode = MakeBTreeNode();
		SetData(newNode, data);
		return newNode;
	}

	if (bt->data < data)
		bt->right = BSTInsert(bt->right, data);
	else if (bt->data > data)
		bt->left = BSTInsert(bt->left, data);
	else
		printf("중복된 값이 존재합니다.\n");
	return bt;
}

/*
BTreeNode* BSTRemove(BTreeNode * bt, BTData data) {

	BTreeNode* target = bt;
	BTreeNode* before = NULL;
	BTreeNode* next = NULL;
	BTreeNode* nextBefore = NULL;
	while ((target != NULL) && (target->data != data)) {
		before = target;
		if (target->data > data)
			target = target->left;
		else
			target = target->right;
	}
	if (bt == NULL) {
		printf("bt == NULL\n");
		printf("404 Not Found Exception\n");
		return bt;
	}
	else if (((target->left) == NULL) && ((target->right) == NULL)) {
		printf("%d 삭제\n", data);
		if (before != NULL) {
			if (before->left == target)
				before->left = NULL;
			else
				before->right = NULL;
		}
		else
			bt = NULL;
	}
	else if (((target->left) == NULL) || ((target->right) == NULL)) {
		printf("%d 삭제\n", data);
		BTreeNode* next;
		if (target->left == NULL)
			next = target->right;
		else
			next = target->left;

		if (before != NULL) {
			if (before->right == target)
				before->right = next;
			else
				before->left = next;
		}
		else
			next = bt;
	}
	else {
		printf("%d 삭제\n", data);
		next = target->left;
		nextBefore = target;
		while (next->right != NULL) {
			nextBefore = next;
			next = next->right;
		}
		target->data = next->data;

		if (nextBefore->right == next)
			nextBefore->right = next->left;
		else
			nextBefore->left = next->left;
		target = next;
	}
	free(target);
	return bt;
}
*/

BTreeNode* BSTRemove(BTreeNode** bt, BTData data) {
	BTreeNode* target = *bt;
	BTreeNode* before = NULL;
	BTreeNode* next = NULL;
	BTreeNode* nextBefore = NULL;

	printf("==========================\n");
	printf("| [%d] 데이터 탐색 시작 |\n", data);
	printf("==========================\n");

	while ((target != NULL) && (target->data != data)) {
		before = target;
		if (target->data > data)
			target = target->left;
		else
			target = target->right;
	}
	printf("===============\n");
	printf("| 탐색 성공! |\n");
	printf("===============\n");


	if (target == NULL) {
		printf("404 Not Found Exception\n");
		return bt;
	}
	else if ((target->left == NULL) && (target->right == NULL)) {
		printf("[%d] 삭제\n", target->data);
		if (before != NULL) {
			if (before->left == target)
				before->left = NULL;
			else
				before->right = NULL;
		}
	}
	else if ((target->left == NULL) || (target->right == NULL)) {
		printf("[%d] 삭제\n", target->data);
		if (target->left == NULL)
			next = target->right;
		else
			next = target->left;

		if (before != NULL) {
			if (before->right == target)
				before->right = next;
			else
				before->left = next;
		}
		else {
			*bt = next;
		}
	}
	else {
		printf("[%d] 삭제\n", target->data);
		BTData rData = NULL;
		next = target->left;
		nextBefore = target;
		while (next->right != NULL) {
			nextBefore = next;
			next = next->right;
		}
		rData = target->data;

		if (nextBefore->right == next)
			nextBefore->right = next->left;
		else
			nextBefore->left = next->left;
		target->data = next->data;
		target = next;
		target->data = rData;
	}

	return target;
}

void ShowIntData(int data) {
	printf("[%d] -> ", data);
}