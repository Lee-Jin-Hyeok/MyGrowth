#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE 6
#define SIZE2 10

typedef int Data;

void QuickSort(Data*, int, int);
void Print(Data*);
void RandomCreate(Data*);

int main() {
	//Data arr[SIZE] = { 62, 98, 74, 39, 47, 53 };
	Data arr[SIZE] = { 0, };
	RandomCreate(arr);

	printf("변환 전 : ");
	Print(arr);
	QuickSort(arr, 0, SIZE - 1);
	printf("변환 후 : ");
	Print(arr);

	return 0;
}

void QuickSort(Data* arr, int start, int end) {
	int p = start;
	int l = start + 1;
	int h = end;
	int temp = arr[p];

	if (start == end)
		return;
	else if (start + 1 == end) {
		if (arr[start] > arr[end]) {
			int t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
		}
		return;
	}

	while (1) {
		if (l >= h) {
			break;
		}
		if (arr[l] >= arr[p] && arr[h] < arr[p]) {
			int t = arr[l];
			arr[l] = arr[h];
			arr[h] = t;
		}
		if(arr[l] < arr[p])
			l++;
		if (arr[h] >= arr[p])
			h--;
	}
	arr[p] = arr[h];
	arr[h] = temp;

	QuickSort(arr, start, h);
	QuickSort(arr, h, end);
}

void Print(Data* arr) {
	for (int i = 0; i < SIZE; i++)
		printf("[%3d] ", arr[i]);
	printf("\n");
}

void RandomCreate(Data* arr) {
	srand(time(NULL));
	for (int i = 0; i < SIZE; i++)
		arr[i] = (rand() % 1000) + 1;
}