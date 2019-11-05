#ifndef __BINARY_SEARCH_TREE_H__
#define __BINARY_SEARCH_TREE_H__

#include "BinaryTree.h"

BTreeNode* BSTSearch(BTreeNode* bt, BTData data);
void BSTInsert(BTreeNode* bt, BTreeNode* sub);
void ShowIntData(int data);

#endif