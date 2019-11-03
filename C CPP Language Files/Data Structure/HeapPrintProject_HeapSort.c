#include "HeapSort.h"

void HeapInit(Heap* ph, PriorityComp pc)
{
	ph->numOfData = 0;
	ph->comp = pc;
}

int HIsEmpty(Heap* ph)
{
	if (ph->numOfData == 0)
		return TRUE;
	else
		return FALSE;
}

int GetParentIDX(int idx)
{
	return idx / 2;
}

int GetLChildIDX(int idx)
{
	return idx * 2;
}

int GetRChildIDX(int idx)
{
	return GetLChildIDX(idx) + 1;
}

int GetHiPriChildIDX(Heap * ph, int idx)
{
	if (GetLChildIDX(idx) > ph->numOfData)
		return 0;

	else if (GetLChildIDX(idx) == ph->numOfData)
		return GetLChildIDX(idx);

	else
	{
		//	if(ph->heapArr[GetLChildIDX(idx)].pr 
		//				> ph->heapArr[GetRChildIDX(idx)].pr)
		if (ph->comp(ph->heapArr[GetLChildIDX(idx)],
			ph->heapArr[GetRChildIDX(idx)]) < 0)
			return GetRChildIDX(idx);
		else
			return GetLChildIDX(idx);
	}
}

void HInsert(Heap * ph, HData data)
{
	int idx = ++(ph->numOfData);

	while (idx != 1 && ph->comp(data, ph->heapArr[GetParentIDX(idx)]) > 0)
	{
		ph->heapArr[idx] = ph->heapArr[idx / 2];
		idx /= 2;
	}
	ph->heapArr[idx] = data;
}

HData HDelete(Heap * ph)
{
	HData retData = ph->heapArr[1];    // 삭제할 데이터 임시 저장
	HData lastElem = ph->heapArr[(ph->numOfData)--];

	int parentIdx = 1;    // 루트 노드의 Index
	int childIdx;

	while ((childIdx = GetHiPriChildIDX(ph, parentIdx)) && ph->comp(lastElem, ph->heapArr[childIdx]) <= 0)
	{
		ph->heapArr[parentIdx] = ph->heapArr[childIdx];
		parentIdx = childIdx;
	}

	ph->heapArr[parentIdx] = lastElem;
	return retData;
}