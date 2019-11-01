#include "HanoiTower.h"

void StackInit(Stack* list) {
	list->head = NULL;
	list->temp = NULL;
	list->numOfData = 0;
}

void Insert(Stack* list, Data data) {
	Node* newNode = (Node*)malloc(sizeof(Node));
	if (isEmpty(list)) {
		list->head = newNode;
		newNode->next = NULL;
	}
	else {
		newNode->next = list->head;
		list->head = newNode;
	}
	newNode->data = data;
	(list->numOfData)++;
}

void FindAll(Stack* list) {
	Data* data = (Data*)malloc(sizeof(Data) * Count(list));
	int i = 0;

	for (list->temp = list->head; list->temp != NULL; list->temp = list->temp->next)
		data[i++] = list->temp->data;

	for (int j = i-1; j >= 0; j--)
		printf("%d ", data[j]);
	printf("\n");
}

Data Remove(Stack* list) {
	if (isEmpty(list)) {
		return -1;
	}
	Data temp = list->head->data;
	list->head = list->head->next;
	(list->numOfData)--;
	return temp;
}

int isEmpty(Stack* list) {
	if (list->numOfData) {
		return FALSE;
	}
	return TRUE;
}

int Count(Stack* list) {
	return list->numOfData;
}