#include <stdio.h>
#include <math.h>
#include "HeapSort.h"

int DataPriorityComp(int ch1, int ch2)
{
	//return ch2-ch1;		// Min Heap
	return ch1 - ch2;			// Max Heap
}

/* ���� �ε��� ������ �������� ����ϴ� �Լ�*/
void PrintHeap(Heap* heap, char* szTitle) {
	printf("================================\n%s\n================================\n ", szTitle);
	int sizeHeap = (heap->numOfData);
	printf("[ ");
	for (int i = 0; i < sizeHeap; i++)
		printf("%d ", heap->heapArr[i + 1]);
	printf("]\n");
}

int TabCount(int height) {
	int cnt = 1;
	if (height) {
		for (int i = 1; i <= height; i++) cnt *= 2;
	}
	return cnt - 1;
}

/* ���� Ʈ��������� ����ϴ� �Լ�*/
void PrintHeapTree(Heap * heap, char* szTitle) {
	printf("================================\n%s\n================================\n", szTitle);
	int height = 1, sizeHeap = (heap->numOfData);
	int cnt = 0, idx = 1, child = 1, temp;

	while (height <= sizeHeap) {
		height = height * 2;
		if (height > sizeHeap) break;
		cnt++;
	}

	temp = cnt;

	for (cnt; cnt >= 0; cnt--) {
		printf("[LEVEL : %d]\t", temp - cnt);
		for (int t = 0; t < child; t++) {
			for (int tap = 0; tap < TabCount(cnt); tap++)
				printf(". ");
			if (idx >= sizeHeap) break;
			printf("%2d", heap->heapArr[idx++]);
			for (int tap = 0; tap < TabCount(cnt) + 1; tap++) {
				printf(". ");
			}
		}
		printf("\n");
		child *= 2;
	}
}

int main(void)
{
	Heap heap;
	int i, nSizeItemList = 0;

	//int ItemList[] = { 24, 17, 29, 22, 20, 31, 27, 18, 21 };	// ������ 10��
	//int ItemList[] = { 4, 16, 57, 9, 32, 45, 20, 19 };		// ������ 11��
	int ItemList[] = { 50, 40, 30, 25, 30, 20, 10, 5, 15, 20, 12, 15, 16, 14, 16, 45, 75, 86, 34, 76, 34, 34, 76, 34, 23, 67, 98, 34, 34, 76, 34, 23, 67, 98, 34, 34, 76, 34, 23, 67, 98, 34, 34, 76, 34, 23, 67, 98, 34, 34, 76, 23, 67, 98 };	// ������ 12��
	//int ItemList[] = { 50, 40, 30, 25, 30 };

	nSizeItemList = sizeof(ItemList) / sizeof(int);

	HeapInit(&heap, DataPriorityComp);

	for (i = 0; i < nSizeItemList; i++)
	{
		HInsert(&heap, ItemList[i]);
	}

	/*���� �� ��� ���*/
	PrintHeap(&heap, "������");
	PrintHeapTree(&heap, "Ʈ���� ���");

	// ������ 12��
	HInsert(&heap, 45);
	HInsert(&heap, 60);
	PrintHeap(&heap, "����Ÿ 40, 60 ������");
	PrintHeapTree(&heap, "Ʈ���� ���");


	HDelete(&heap);
	PrintHeap(&heap, "����Ÿ 1�� ������");
	PrintHeapTree(&heap, "Ʈ���� ���");

	return 0;
}