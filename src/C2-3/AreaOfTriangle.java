package Odevler;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println("Enter three points for a triangle : (Exp: 3 pcs x and y) ");

		double x1 = inp.nextDouble();
		double y1 = inp.nextDouble();
		double x2 = inp.nextDouble();
		double y2 = inp.nextDouble();
		double x3 = inp.nextDouble();
		double y3 = inp.nextDouble();

		/*
		 * 
		 * Compute the area of a triangle double side1 = Math.pow(Math.pow(x2 - x1, 2) +
		 * Math.pow(y2 - y1, 2), 0.5); double side2 = Math.pow(Math.pow(x3 - x2, 2) +
		 * Math.pow(y3 - y2, 2), 0.5); double side3 = Math.pow(Math.pow(x1 - x3, 2) +
		 * Math.pow(y1 - y3, 2), 0.5); double s = (side1 + side2 + side3) / 2; double
		 * area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		 * 
		 */

		double ss1 = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double side1 = Math.pow(ss1, 0.5);

		double ss2 = Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2);
		double side2 = Math.pow(ss2, 0.5);

		double ss3 = Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2);
		double side3 = Math.pow(ss3, 0.5);

		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		System.out.println("The area of the triangle is : " + area);

	}

}
