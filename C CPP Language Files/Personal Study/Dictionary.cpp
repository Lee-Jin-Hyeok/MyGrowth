#include <stdio.h>
#include <string.h>
#include <iostream>
#define F_SIZE 100
#define S_SIZE 100
#pragma warning(disable:4996)
void struct_insert(FILE*, struct KE *);
void select_menu(int *);
void search(struct KE *save);
void list(struct KE *save);
void add(FILE *);
struct KE {
	char kor[F_SIZE] = { 0, };
	char eng[F_SIZE];
};
int main()
{
	FILE *fp = NULL;
	fopen_s(&fp, "dictionary.txt", "r+");
	if (fp == NULL)
	{
		printf("������ �����ϴ�.");
		return 0;
	}
	else
	{
		int menu;
		struct KE save[S_SIZE];
		struct_insert(fp, save);
		while(1){
			select_menu(&menu);
			switch (menu)
			{
			case 1:
				search(save);
				break;
			case 2:
				list(save);
				break;
			case 3:
				add(fp);
				struct_insert(fp, save);
				break;
			case 4:
				return 0;
				break;
			default:
				printf("\n\n\n�޴� �߿��� �����Ͽ� �ֽʽÿ�\n\n\n");
				break;
			}
		}
	}
	fclose(fp);
}
void struct_insert(FILE*fp, struct KE *save)
{
	fclose(fp);
	fopen_s(&fp, "dictionary.txt", "r+");
	save[F_SIZE];
	int i = 0;
	char name[1024] = { 0, };
	char ptrs[] = " \n-";
	while (!feof(fp))
	{
		if (fgets(name, F_SIZE, fp) == NULL) break;
		char *ptr = strtok(name, ptrs);
		strcpy(save[i].kor, ptr);
		ptr = strtok(NULL, ptrs);
		strcpy(save[i].eng, ptr);
		ptr = strtok(NULL, ptrs);
		i++;
	}
}
void select_menu(int *select)
{
	int i;
	for (i = 0; i < 60; i++)
		printf("=");
	printf("\n              �޴��� �Է��� �ּ���\n");
	printf("1.�ܾ� �˻�     2.�ܾ� ����Ʈ     3.�ܾ� �߰�     4.����\n");
	for (i = 0; i < 60; i++)
		printf("=");
	printf("\n");
	scanf_s("%d", select);
}
void search(struct KE *word)
{
	int i = 0;
	char str[F_SIZE];
	printf("ã���� �ϴ� �ܾ �Է��� �ּ��� : ");
	scanf_s("%s", str, sizeof(str));
	while ((word + i)->kor[0] != '\0')
	{
		if (!strcmp((word + i)->kor, str))
		{
			printf("%s�� ���ܾ�� %s�Դϴ�!\n", (word + i)->kor, (word + i)->eng);
			FILE *fp_add;
			fopen_s(&fp_add, "record.txt", "a");
			fputs((word + i)->eng, fp_add);
			fputs("\n", fp_add);
			fclose(fp_add);
			return;
		}
		i++;
	}
	puts("���� �ܾ��Դϴ�. �߰��غ��ô°� ��Ű���?");
}
void list(struct KE *word)
{
	int i = 0;
	while ((word + i)->kor[0] != '\0')
	{
		printf("%s - %s\n", (word + i)->kor, (word + i)->eng);
		i++;
	}
}
void add(FILE *fp)
{
	char new_kor[F_SIZE], new_eng[F_SIZE];
	printf("�߰��� �ѱ۴ܾ �Է��Ͻÿ� : ");
	scanf_s("%s", new_kor, sizeof(new_kor));
	printf("�߰��� �ѱ۴ܾ��� ���� ������ �Է��Ͻÿ� : ");
	scanf_s("%s", new_eng, sizeof(new_eng));
	fputs("\n", fp);
	fputs(new_kor, fp);
	fputs(" - ", fp);
	fputs(new_eng, fp);
	puts("�� �ܾ �߰��Ǿ����ϴ�!");		
}