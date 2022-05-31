package Bolum01;

import java.util.Scanner;

public class dikdortgenAlanCevreHesabi {
	
	public static void main (String []args ) {
		
		Scanner girdi1 = new Scanner(System.in);
		Scanner girdi2 = new Scanner(System.in);
		
		double a;
		double b;
		double alan;
		double cevre;
	
		
		System.out.println("Alani hesaplanacak cismin a kenar uzunlugunu giriniz: ");
				a = girdi1.nextDouble();
		System.out.println("Alani hesaplanacak cismin b kenar uzunlugunu giriniz: ");		
				b = girdi2.nextDouble();
				
		
		alan = a * b  ;
		cevre = 2 * b + 2 * a;
		
		
		//alani yazdir
		System.out.println("a kenari" + a + "b kenari" + b +  " olan cismin alani " + alan +  " dir");
		System.out.println("a kenari" + a + "b kenari" + b +   " olan cismin alani " + cevre +  " dir");
		
	}

}
