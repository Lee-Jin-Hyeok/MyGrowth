#include <stdio.h>
#include "Dijkstra.h"

void dijkstra(DData(*weight)[VER_NUM], DData(*distance)[VER_NUM], int start) {
	printf("---------------\n");
	for (int i = 0; i < VER_NUM; i++) {
		for (int j = 0; j < VER_NUM; j++)
			printf("[%7d]\t", weight[i][j]);
		printf("\n");
	}
	printf("start\n");
	for (int i = 0; i < VER_NUM; i++) {
		printf("re\n");
		distance[start][i] = weight[start][i];
	}
}