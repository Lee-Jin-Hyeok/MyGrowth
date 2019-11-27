#include <stdio.h>
#include "BinarySearchTree.h"

#define _TEST_DEBUG

int main(void)
{

	BTreeNode* bstRoot;
	BTreeNode* sNode;

	BSTData insertKey[] = { 50, 60, 70, 90, 80, 75, 73, 72, 78 };
	BSTData searchKey[] = { 4,70,8 };

	int i = 0;
	char szDesc[64];

	BSTMakeAndInit(&bstRoot);

	for (i = 0; i < sizeof(insertKey) / sizeof(BSTData); i++) {
		printf("dd\n");
		AVLInsert(&bstRoot, insertKey[i]);
	}

	for (i = 0; i < sizeof(searchKey) / sizeof(BSTData); i++) {
		if (sNode = BSTSearch(bstRoot, searchKey[i]))
			printf("탐색 성공^*^ Key[%d] \n", searchKey[i]);
		else
			printf("탐색 실패  -_- Key[%d] \n", searchKey[i]);
	}

	BSTShowAll(bstRoot, "삽입후 이진탐색트리 중위순회 결과");

	printf(" root= : %d \n root->left:%d\n root->right:%d\n", bstRoot->data, bstRoot->left->data, bstRoot->right->data);

	for (i = 0; i < sizeof(searchKey) / sizeof(BSTData); i++) {
		sNode = BSTRemove(&bstRoot, searchKey[i]);
		printf("%d 삭제! \n", sNode->data);
		free(sNode);
		BSTShowAll(bstRoot, "삭제후");
		printf(" root= : %d \n root->left:%d\n root->right:%d\n", bstRoot->data, bstRoot->left->data, bstRoot->right->data);

	}


	return 0;
}