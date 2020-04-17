package RealTest2;

import java.util.Scanner;

class Term {
	private int base;
	private int quotient;
	
	public Term(int base, int quotient) {
		this.base = base;
		this.quotient = quotient;
	}
	
	public int getBase() {
		return base;
	}
	
	public int getQuotient() {
		return quotient;
	}
}

public class MainClass {
	private static Scanner sc = new Scanner(System.in);
	
	public static Term[] input(int count) {
		Term[] term = new Term[count];
		int base = 0;
		int quotient = 0;
		
		for(int i = 0 ; i < count ; i++) {
			base = sc.nextInt();
			quotient = sc.nextInt();
			term[i] = new Term(base, quotient);
		}
		
		return term;
	}
	
	public static int maxQuotient(Term[] t1, Term[] t2) {
		int maxValue = t1[0].getQuotient();
		
		for(int i = 1 ; i < t1.length ; i++)
			if(maxValue < t1[i].getQuotient())
				maxValue = t1[i].getQuotient();

		for(int i = 0 ; i < t2.length ; i++)
			if(maxValue < t2[i].getQuotient())
				maxValue = t2[i].getQuotient();
		
		return maxValue;
	}
	
	public static void print(int index, int value) {
		if(index == 1) {
			if(value == 1)
				System.out.print("x");
			else
				System.out.print(value + "x");
		} else if(index == 0) {
			System.out.print(value);
		} else {
			if(value == 1)
				System.out.print("x^" + index);
			else
				System.out.print(value + "x^" + index);
		}
	}
	
	public static void main(String[] args) {
		Term[] t1 = input(sc.nextInt());
		Term[] t2 = input(sc.nextInt());		
		int[] result = new int[maxQuotient(t1, t2) + 1];
		
		for(int i = 0 ; i < t1.length ; i++)
			result[t1[i].getQuotient()] += t1[i].getBase();
		for(int i = 0 ; i < t2.length ; i++)
			result[t2[i].getQuotient()] += t2[i].getBase();
		
		int c = result.length - 1;
		for(int i = result.length - 1 ; i >= 0 ; i--)
			if(result[i] != 0)
				c = i;
		
		boolean zero = true;
		for(int i = result.length - 1 ; i >= 0 ; i--) {
			if(result[i] != 0) {
				zero = false;
				print(i, result[i]);
				if(i != c)
					System.out.print("+");
				else
					break;
			}
		}
		
		if(zero)
			System.out.print(0);
	}
}