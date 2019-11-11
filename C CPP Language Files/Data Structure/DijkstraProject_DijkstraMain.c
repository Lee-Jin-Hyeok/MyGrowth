#include <stdio.h>
#include "Dijkstra.h"

int main() {
	DData weight[VER_NUM][VER_NUM] = {
		{ 0,   3,  INF,	 4,  INF},
		{ 2,   0,  INF,	 6,  INF},
		{ 6,  INF,  0,	 1,  INF},
		{INF,  2,   2,   0,   4 },
		{INF,  4,  INF, INF,  0 }
	};
	DData distance[VER_NUM][VER_NUM];
	memset(distance, 0, sizeof(distance));

	for (int i = 0; i < VER_NUM; i++) {
		for (int j = 0; j < VER_NUM; j++)
			printf("[%7d]\t", weight[i][j]);
		printf("\n");
	}

	dijkstra(weight, distance, A);

	return 0;
}