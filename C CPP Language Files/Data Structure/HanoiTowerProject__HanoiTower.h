#ifndef __HANOI_TOWER_H__
#define __HANOI_TOWER_H__

#include "HanoiStack.h"

Stack* stack1;
Stack* stack2;
Stack* stack3;

void HanoiInit(int);
void Move(Stack*, Stack*);
void Hanoi(int, Stack*, Stack*, Stack*);

#endif