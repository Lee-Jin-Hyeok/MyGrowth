#include <stdio.h>

#define ARRAY_LENGTH 6

void Print(int*);
void swap(int*, int*);
void InitHeapSort(int*);
int RemoveHeapSort(int*);
int isLast(int*);
int isChild(int*, int);

int main() {
	int heap[ARRAY_LENGTH] = { 62, 93, 74, 36, 58, 47 };

	printf("------------\n");
	printf("| HeapSort |\n");
	printf("------------\n\n");

	printf("-- 정렬 전\n");
	Print(heap);
	InitHeapSort(heap);
	printf("-- 정렬 후\n");
	Print(heap);

	printf("-- 변경 중\n");
	printf("[ %d ]\n", RemoveHeapSort(heap));

	printf("-- 변경 후\n");
	Print(heap);

	return 0;
}

void Print(int* arr) {
	for (int i = 0; i < ARRAY_LENGTH; i++)
		printf("%d ", arr[i]);
	printf("\n");
}

void swap(int* n1, int* n2) {
	int temp = *n1;
	*n1 = *n2;
	*n2 = temp;
}

void InitHeapSort(int* heap) {
	int temp[ARRAY_LENGTH];
	
	for (int i = 0; i < ARRAY_LENGTH; i++) {
		int index = i;
		temp[i] = heap[index];
		while (1) {
			if (temp[index] < temp[(index - 1) / 2]) {
				swap(&temp[index], &temp[(index - 1) / 2]);
				index = (index - 1) / 2;
			}
			else break;
		}
	}

	for (int i = 0; i < ARRAY_LENGTH; i++)
		heap[i] = temp[i];
}

int RemoveHeapSort(int* heap) {
	int index = 0;
	int data = heap[0];
	int lastIndex = isLast(heap);
	heap[0] = heap[lastIndex];
	heap[lastIndex] = NULL;

	while (1) {
		if (isChild(heap, index) == 1) {
			int t = heap[(index + 1) * 2];
			if (heap[(index + 1) * 2 - 1] < heap[(index + 1) * 2])
				t = heap[(index + 1) * 2 - 1];
			if (heap[index] > heap[t]) {
				swap(&heap[index], &heap[t]);
				index = t;
			}
			else break;
		}
		else if (isChild(heap, index) == 2) {
			if (heap[index] > heap[(index + 1) * 2 - 1]) {
				swap(&heap[index], &heap[(index + 1) * 2-1]);
				index = (index + 1) * 2 -1;
			}
			else break;
		}
		else break;
	}

	return data;
}

int isLast(int* heap) {
	int index;
	for (index = 0; heap[index] && index < ARRAY_LENGTH - 1; index++);
	return index;
}

int isChild(int* heap, int index) {
	if (heap[(index + 1) * 2 - 1] > 0 && heap[(index + 1) * 2] > 0)
		return 1;
	else if (heap[(index + 1) * 2 - 1] > 0)
		return 2;
	else
		return 0;
}