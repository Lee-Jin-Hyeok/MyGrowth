#include <stdio.h>
#include <stdlib.h>

#define TRUE	1
#define FALSE	0
#define MAX_SZ	8

typedef char cData;

typedef struct _circleQueue {
	cData arr[MAX_SZ];
	int front;
	int rear;
	int numOfData;
} CQueue;

void QueueInit(CQueue*);							// 생성한 Queue 초기화
void push(CQueue*, cData);							// 입력한 정보를 Queue에 삽입
cData pop(CQueue*);									// Queue에 들어간 정보를 삭제하고 리턴
void ShowInterface(CQueue*, const char*, char);		// Queue의 모든 정보를 출력

int isEmpty(CQueue*);								// Queue가 비어있는지 확인
int isFull(CQueue*);								// Queue가 꽉 차있는지 확인

int main() {
	CQueue queue;
	char input_ch = 0;

	QueueInit(&queue);
	while (TRUE) {
		scanf(" %c", &input_ch);
		while (getchar() != '\n');
		if (input_ch == '9') {
			printf("프로그램이 종료되었습니다.\n");
			exit(-1);
		}
		else if (input_ch == '0') {
			pop(&queue);
		}
		else {
			push(&queue, input_ch);
		}
	}

	return 0;
}

void QueueInit(CQueue* queue) {
	queue->front = 0;					// 모든 정보 초기화
	queue->rear = 0;

	for (int i = 0; i < MAX_SZ; i++)	// ShowInterface() 함수를 위한 배열 초기화
		queue->arr[i] = NULL;

	ShowInterface(queue, "", '^');		// 첫 입력을 위한 View
}

void push(CQueue* queue, cData data) {
	if (isFull(queue)) {															// push를 할 때는 꽉 차있는지 확인하고 꽉 차있으면 리턴
		ShowInterface(queue, "큐가 가득차서 입력한 값을 push할 수 없습니다.", '^');
		return;
	}
	if (queue->rear == MAX_SZ - 1)													// rear의 위치가 7에서 0으로 이동하기 위한 예외처리
		queue->rear = -1;
	queue->arr[++(queue->rear)] = data;												// rear의 위치를 ++하고 삽입
	ShowInterface(queue, "입력한 원소 : ", data);									// view
}

cData pop(CQueue* queue) {
	if (isEmpty(queue)) {															// pop을 할 때는 비어있는지 확인하고 비어있으면 리턴
		ShowInterface(queue, "큐가 비어서 pop을 할 수 없습니다.", '^');
		return;
	}
	
	if (queue->front == MAX_SZ - 1)													// front의 위치가 7에서 0으로 이동하기 위한 예외처리
		queue->front = -1;
	cData data = queue->arr[++(queue->front)];										// 임시 data 변수에 삭제할 데이터 저장
	queue->arr[queue->front] = NULL;												// 삭제를 위해 삭제할 곳에 NULL 저장
	ShowInterface(queue, "삭제한 원소 : ", data);									// view

	return data;																	// 삭제한 데이터 리턴
}

void ShowInterface(CQueue* queue, const char* message, char sub) {
	char* ch = "01234567";															// view를 출력할 때 배열 인덱스를 출력하기 위해서 사용

	system("cls");																	// main에서 입력할 때마다 화면 초기화
	printf("[Status] %s", message);													// Status 메세지 출력
	if (!(sub == '^'))																// 부가적인 원소 메세지 출력이 필요한지 확인
		printf("%c", sub);
	printf("\n\n삽입을 원하는 원소를 입력하세요.\n0을 입력하면 원소를 pop합니다.\n프로그램을 종료하려면 9를 누르세요.\n\n");
	printf("         원 형 큐\n");
	printf("  rear = %d / front = %d\n", queue->rear, queue->front);
	printf("   ,---,  ,---,  ,---,\n");
	printf("   | %c |  | %c |  | %c |\n", queue->arr[0], queue->arr[1], queue->arr[2]);
	printf("   '-%c-'  '-%c-'  '-%c-'\n", ch[0], ch[1], ch[2]);
	printf("   ,---,         ,---,\n");
	printf("   | %c |         | %c |\n", queue->arr[7], queue->arr[3]);
	printf("   '-%c-'         '-%c-'\n", ch[7], ch[3]);
	printf("   ,---,  ,---,  ,---,\n");
	printf("   | %c |  | %c |  | %c |\n", queue->arr[6], queue->arr[5], queue->arr[4]);
	printf("   '-%c-'  '-%c-'  '-%c-'\n", ch[6], ch[5], ch[4]);
	printf("   입력 값 : ");

}

int isEmpty(CQueue* queue) {
	if (queue->front == queue->rear)		// front와 rear가 같으면 Queue가 비어있다.
		return TRUE;						// 비어있을 때 TRUE
	return FALSE;							// 비어있지 않을 때 FALSE
}

int isFull(CQueue* queue) {
	if ((queue->front == queue->rear + 1) || (queue->front == 0 && queue->rear == 7))	// rear 바로 다음에 front가 존재하면 Queue가 꽉 참
		return TRUE;																	// 꽉 차 있을 때 TRUE
	return FALSE;																		// 꽉 차 있지 않을 때 FALSE
}