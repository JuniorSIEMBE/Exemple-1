package org.sid;

public class TestSegment {

	public static void main(String[] args) {
		Segment s = new Segment(24, 12);
		System.out.println(s.toString());
		System.out.println("Longueur = "+s.getLongueur());
		if(s.appartient(15)) {
			System.out.println("Ce point appartient au segment");
		}
		System.out.println("Extr�mit� 1 = "+s.getExtr1());
		System.out.println("Extr�mit� 2 = "+s.getExtr2());
		s.setExtr1(10);
		s.setExtr2(15);
		System.out.println("Longueur = "+s.getLongueur());
	}

}
