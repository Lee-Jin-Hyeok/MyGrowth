#include <stdio.h>
#include <stdlib.h>
#include "HeapSort.h"

void Insert(Heap* ph, Data data, Priority pr) {
	int idx = ++(ph->numOfData);
	Node node = { pr, data };

	while (idx != 1 && pr < (ph->heapArr[idx / 2].pr)) {
		ph->heapArr[idx] = ph->heapArr[idx / 2];
		idx /= 2;
	}
	ph->heapArr[idx] = node;
}