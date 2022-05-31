package Odevler;

import java.util.Scanner;

public class AreaofHexagon {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner (System.in);
		
		
		System.out.println("ENter the side : " );
		double s = inp.nextDouble();
		
		
		Double area;
		
		area = 3 * Math.pow(3, 0.5)	/ 2 * Math.pow(s, 2) ;
		
		
		System.out.println(" The area of the hexagon : "+ (int)(area * 100) / 100.0);

	}

}
