package jkl.mno.pqr;

public class MyCalculator implements Calculator {
	private int kor;
	private int eng;
	private int mat;
	private int sci;
	
	public MyCalculator() {}

	public MyCalculator(int kor, int eng, int mat, int sci) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
	}
	
	@Override
	public int sum() {
		int sum = kor + eng + mat + sci;
		return sum;
	}

	@Override
	public double avg() {
		
		double avg = sum()/4.0;
		
		return avg;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}
}