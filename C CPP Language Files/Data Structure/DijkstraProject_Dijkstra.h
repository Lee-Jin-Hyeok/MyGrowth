#ifndef __DIJKSTRA_H__
#define __DIJKSTRA_H__

#define INF		100000
#define VER_NUM 5

#define A		0
#define B		1
#define C		2
#define D		3
#define E		4

typedef int DData;

void dijkstra(DData(*weight)[VER_NUM], DData(*distance)[VER_NUM], int);

#endif