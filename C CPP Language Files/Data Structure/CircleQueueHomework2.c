#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define TRUE	1
#define FALSE	0
#define SIZE	12
#define COMM	"We00Study000000AlgorithmVeryHard9"

int commandCnt = 0;

typedef char Data;

typedef struct _circleQueue {
	Data arr[SIZE];
	int front;
	int rear;
} CircleQueue;

typedef CircleQueue Queue;

void QueueInit(Queue*);
void Enqueue(Queue*, Data);
void Dequeue(Queue*);
void ShowInterface(Queue*, const char*, const char*, char);
int isEmpty(Queue*);
int isFull(Queue*);

int main() {
	Queue queue;

	QueueInit(&queue);
	printf("'Enter'를 살포시 눌러주세요!\n");
	while (TRUE) {
		getchar();
		switch (COMM[commandCnt]) {
		case '9':
			ShowInterface(&queue, "End of JOB >", "End\n", ' ');
			return 0;
		case '0':
			Dequeue(&queue);
			break;
		default :
			Enqueue(&queue, COMM[commandCnt]);
			break;
		}
	}
	
	return 0;
}

void QueueInit(Queue* queue) {
	queue->front = 0;
	queue->rear = 0;

	for (int i = 0; i < SIZE; i++)
		queue->arr[i] = ' ';
}

void Enqueue(Queue* queue, Data data) {
	if (isFull(queue)) {
		(queue->rear)++;
		ShowInterface(queue, "Insert to Rear %d >", "\tQueue is Full!!! %c\n", ' ');
		return;
	}
	if (queue->rear == SIZE - 1)
		queue->rear = -1;
	queue->arr[++(queue->rear)] = data;
	ShowInterface(queue, "Insert to Rear %d >", "\tInsert [ %c ]\n", queue->arr[queue->rear]);
}

void Dequeue(Queue* queue) {
	if (isEmpty(queue)) {
		(queue->front)++;
		ShowInterface(queue, "Delete from Front %d >", "\tQueue is Empty!!! %c\n", ' ');
		return;
	}
	if (queue->front == SIZE - 1)
		queue->front = -1;
	Data data = queue->arr[++(queue->front)];
	queue->arr[queue->front] = ' ';
	ShowInterface(queue, "Delete from Front %d >", "\tDelete [ %c ]\n", data);
}

void ShowInterface(Queue* queue, const char* message, const char* status, Data ch) {
	system("cls");
	printf("<< We00Study000000AlgorithmVeryHard9 >>\n\n");
	printf("< Command %c > ", COMM[commandCnt++]);
	if (!(strcmp(message, "Delete from Front %d >"))) {
		printf(message, queue->front);
		if (ch == ' ')
			(queue->front)--;
	}
	else {
		printf(message, queue->rear);
		if (ch == ' ')
			(queue->rear)--;
	}
	printf(status, ch);

	printf("\n --- --- --- --- \n");
	printf("| %c | %c | %c | %c |\n", queue->arr[0], queue->arr[1], queue->arr[2], queue->arr[3]);
	printf(" --- --- --- --- \n");
	printf("| %c ||||||||| %c |\n", queue->arr[11], queue->arr[4]);
	printf(" --- --- --- --- \n");
	printf("| %c ||||||||| %c |\n", queue->arr[10], queue->arr[5]);
	printf(" --- --- --- --- \n");
	printf("| %c | %c | %c | %c |\n", queue->arr[9], queue->arr[8], queue->arr[7], queue->arr[6]);
	printf(" --- --- --- --- \n");
}

int isEmpty(Queue* queue) {
	if (queue->front == queue->rear)
		return TRUE;
	return FALSE;
}

int isFull(Queue* queue) {
	if ((queue->front == queue->rear + 1) || (queue->front == SIZE - 1 && queue->rear == 0))
		return TRUE;
	return FALSE;
}