#ifndef __AVL_REBALANCE_H__
#define __AVL_REBALANCE_H__

#include "BinaryTree.h"

BTreeNode* rebalance(BTreeNode** pRoot);
BTreeNode* recursiveRebalance(BTreeNode** pRoot);

#endif