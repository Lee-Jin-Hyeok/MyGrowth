#include "PQueue.h"
#include "Heap.h"

void PQueueInit(PQueue* ppq, PriorityComp pc) {
	HeapInit(ppq, pc);
}

int PQIsEmpty(PQueue* ppq) {
	return HIsEmpty(ppq);
}

void PEnqueue(PQueue* ppq, PQData data) {
	HInsert(ppq, data);
}

PQData PDequeue(PQueue* ppq) {
	return HDelete(ppq);
}

/*
int DataPriorityComp(char ch1, char ch2) {
	return ch2-ch1;
}
*/