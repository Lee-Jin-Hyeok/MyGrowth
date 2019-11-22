#ifndef __BINARY_SEARCH_TREE_H__
#define __BINARY_SEARCH_TREE_H__

#include "BinaryTree.h"

BTreeNode* BSTSearch(BTreeNode* bt, BTData data);
BTreeNode* BSTInsert(BTreeNode* bt, BTData data);
BTreeNode* BSTRemove(BTreeNode** bt, BTData data);
void ShowIntData(int data);

#endif