package RealTest;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] array = {
				{1, 2},
				{1, 2, 3},
				{1, 2, 3, 4}
		};
		System.out.println(array.length);
		System.out.println(array[0].length);
		
		int max = 0;
		int[] array2 = { 1, 5, 3, 8, 2 };
		
		for(int i = 0 ; i < array2.length ; i++)
			if(array2[i] > max)
				max = array2[i];
		
		System.out.println("max is " + max);
		
		
		int sum = 0;
		double avg = 0.0;
		
		int[][] array3 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		
		int cnt = 0;
		for(int i = 0 ; i < array3.length ; i++) {
			for(int j = 0 ; j < array3[i].length ; j++) {
				sum += array3[i][j];
				cnt++;
			}
		}
		avg = (double)sum / cnt;
		
		System.out.println("sum is " + sum);
		System.out.println("avg is " + avg);
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("============================================================");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("============================================================");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				scores = new int[scanner.nextInt()];
			} else if(selectNo == 2) {
				for(int i = 0 ; i < scores.length ; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) {
				for(int i = 0 ; i < scores.length ; i++)
					System.out.println("scores[" + i + "]: " + scores[i]);
			} else if(selectNo == 4) {
				int mmax = 0;
				int ssum = 0;
				for(int i = 0 ; i < scores.length ; i++) {
					if(scores[i] > mmax)
						mmax = scores[i];
					ssum += scores[i];
				}
				System.out.println("�ְ� ���� : " + mmax);
				System.out.println("��� ���� : " + (double)ssum / scores.length);
			} else if(selectNo == 5) {
				run = false;
			} else {
				System.out.println("������ ��ȣ�� �Է����ּ���.");
			}
		}
		
		System.out.println("���α׷��� ����˴ϴ�.");
		
		
		
		int[][] array5 = new int[3][4];
		System.out.println(array5.length);
		System.out.println(array5[0].length);
		System.out.println(array5[1].length);
	}
}
