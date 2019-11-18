#ifndef __KRUSKAL_H__
#define __KRUSKAL_H__

#include "DLinkedList.h"
#include "PQueue.h"
#include "Edge.h"

enum {A, B, C, D, E, F, G, H, I, J};

typedef struct _ual {
	int numV;
	int numE;
	List* adjList;
	int* visitInfo;
	PQueue pqueue;
} Graph;

void GraphInit(Graph* pg, int nv);
void GraphDestroy(Graph* pg);
void AddEdge(Graph* pg, int fromV, int toV, int weight);
void ShowGraphEdgeInfo(Graph* pg);
void DFShowGraphVertex(Graph* pg, int startV);
void ConKruskalMST(Graph* pg);
void ShowGraphEdgeWeightInfo(Graph* pg);
int PQWeightComp(Edge d1, Edge d2);
int WhoIsPrecede(int data1, int data2);
void RemoveEdge(Graph* pg, int fromV, int toV);
void RemoveWayEdge(Graph* pg, int fromV, int toV);
void RecoverEdge(Graph* pg, int fromV, int toV, int weight);
int IsConnVertex(Graph* pg, int v1, int v2);

#endif