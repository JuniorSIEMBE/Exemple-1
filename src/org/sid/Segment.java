package org.sid;

public class Segment {
	
	private int extr1;
	
	private int extr2;

	public Segment(int extr1, int extr2) {
		this.extr1 = extr1;
		this.extr2 = extr2;
	}

	public int getExtr1() {
		return extr1;
	}

	public void setExtr1(int extr1) {
		this.extr1 = extr1;
	}

	public int getExtr2() {
		return extr2;
	}

	public void setExtr2(int extr2) {
		this.extr2 = extr2;
	}
	
	public void ordonne() {
		int xch=0;
		if(extr2<extr1) {
			xch = extr1;
			extr1 = extr2;
			extr2 = xch;
		}
	}
	
	public int getLongueur() {
		ordonne();
		return (extr2-extr1);
	}
	
	public boolean appartient(int x) {
		if(x>=extr1 && x<=extr2) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Segment [extr1=" + extr1 + ", extr2=" + extr2 + "]";
	}

}
