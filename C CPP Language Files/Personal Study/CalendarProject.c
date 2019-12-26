#include <stdio.h>
#include <stdlib.h>

#define HEIGHT	6
#define WIDTH	7

int** InitCalendar(int**);
void CreateCalendar(int**, int, int);
void PrintCalendar(int**, int, int);
void DeleteCalendar(int**);
int FindYoilOfOneMonthOneDay(int);
int FindYoilOfThisMonthOneDay(int, int, int);
int FindLastDayOfThisMonth(int, int);

int main() {
	int** calendar = NULL;

	calendar = InitCalendar(calendar);
	CreateCalendar(calendar, 2019, 12);
	PrintCalendar(calendar, 2019, 12);
	DeleteCalendar(calendar);

	return 0;
}
int** InitCalendar(int** calendar) {
	calendar = (int**)malloc(sizeof(int*) * HEIGHT);
	if (calendar == NULL) return;
	for (int i = 0; i < HEIGHT; i++)
		calendar[i] = (int*)malloc(sizeof(int) * WIDTH);

	return calendar;
}

void CreateCalendar(int** calendar, int year, int month) {
	int yoilOfThisMonthOneDay = FindYoilOfThisMonthOneDay(year, month, FindYoilOfOneMonthOneDay(year));
	int lastDayOfThisMonth = FindLastDayOfThisMonth(year, month);
	int count = 0;

	for (int i = 0; i < HEIGHT; i++) {
		for (int j = 0; j < WIDTH; j++) {
			if ((i == 0 && count < yoilOfThisMonthOneDay) || (count > lastDayOfThisMonth))
				calendar[i][j] = 0;
			else
				calendar[i][j] = ++count;
		}
	}

	return calendar;
}

void PrintCalendar(int** calendar, int year, int month) {
	printf("    [%4d년 %2d월 달력]\n", year, month);
	for (int i = 0; i < HEIGHT; i++) {
		for (int j = 0; j < WIDTH; j++) {
			printf("%2d  ", calendar[i][j]);
		}
		printf("\n");
	}
}

void DeleteCalendar(int** calendar) {
	for (int i = 0; i < HEIGHT; i++)
		free(calendar[i]);
	free(calendar);
}

int FindYoilOfOneMonthOneDay(int year) {
	int yoil = year - 1;
	for (int i = 1; i <= year; i++)
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			yoil++;

	int temp = yoil % 7;
	if (temp == 6) temp = 0;
	else temp++;

	return temp;
}

int FindYoilOfThisMonthOneDay(int year, int month, int yoil) {
	int yun = 0;
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		yun = 1;

	int arr[13] = { 0, 31, 28 + yun, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	for (int i = 1; i < month; i++)
		yoil += arr[i];

	return yoil % 7;
}

int FindLastDayOfThisMonth(int year, int month) {
	int yun = 0;
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		yun = 1;

	int arr[12] = { 31, 28 + yun, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	return arr[month-1];
}