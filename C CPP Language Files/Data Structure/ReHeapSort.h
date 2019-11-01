#ifndef __HEAP_SORT__H__
#define __HEAP_SORT__H__

#define TRUE 1
#define FALSE 0
#define ARRAY_LENGTH 100

typedef char Data;
typedef int Priority;

typedef struct _heapNode {
	Priority pr;
	Data data;
} HeapNode;

typedef HeapNode Node;

typedef struct _heap {
	int numOfData;
	Node heapArr[ARRAY_LENGTH];
} Heap;

void HeapInit(Node);
void Insert(Data);

#endif