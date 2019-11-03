#include <stdio.h>
#include <math.h>
#include "HeapSort.h"

int DataPriorityComp(int ch1, int ch2) {
	//return ch2-ch1;		// Min Heap
	return ch1 - ch2;			// Max Heap
}

/* 힙을 인덱스 순서로 선형으로 출력하는 함수*/
void PrintHeap(Heap* heap, char* szTitle) {
	printf("================================\n%s\n================================\n ", szTitle);
	int sizeHeap = (heap->numOfData);
	printf("[ ");
	for (int i = 0; i < sizeHeap; i++)
		printf("%d ", heap->heapArr[i + 1]);
	printf("]\n");
}

/* 힙을 트리모양으로 출력하는 함수*/
void PrintHeapTree(Heap* heap, char* szTitle) {
	printf("================================\n%s\n================================\n ", szTitle);
	int i = 1, sizeHeap = (heap->numOfData);
	
	while (i <= sizeHeap) {
		if (i * 2 > sizeHeap)
			break;
		i = i * 2;
	}
	printf("%d\n", i);

	int front = i - 1;
	int between = i * 2;
	int count = 1;
	int index = 1;

	while (count <= sizeHeap) {
		int ftemp = front;
		while (ftemp--)
			printf("\t");

		int ctemp = count;
		while (ctemp--) {
			if (index > sizeHeap) {
				printf("\n");
				return;
			}
			printf("%d", heap->heapArr[index++]);
			if (index != 2) {
				int btemp = between;
				while (btemp--)
					printf("\t");
			}
		}
		count *= 2;
		front /= 2;
		between /= 2;
		printf("\n");
	}
	printf("\n");
}

int main(void) {
	Heap heap;
	int i, nSizeItemList = 0;

	int ItemList[] = { 50, 40, 30, 25, 30, 20, 10, 5, 15, 20 };

	nSizeItemList = sizeof(ItemList) / sizeof(int);

	HeapInit(&heap, DataPriorityComp);

	for (i = 0; i < nSizeItemList; i++) {
		HInsert(&heap, ItemList[i]);
	}

	/*삽입 후 결과 출력*/
	PrintHeap(&heap, "삽입후");
	PrintHeapTree(&heap, "트리의 모양");

	// 수행평가 12번
	HInsert(&heap, 45);
	HInsert(&heap, 60);
	PrintHeap(&heap, "데이타 40, 60 삭입후");
	PrintHeapTree(&heap, "트리의 모양");


	HDelete(&heap);
	PrintHeap(&heap, "데이타 1개 삭제후");
	PrintHeapTree(&heap, "트리의 모양");

	return 0;
}
