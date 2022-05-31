package Odevler;

import java.util.Scanner;

public class poundToKilos {

	public static void main(String[] args) {
		System.out.println(" Kiloya cevirilecek olan Pound Miktarini Giriniz : ");

		Scanner input = new Scanner(System.in);
		
		double kilos;
		double ceviri;
		
		double pound = input.nextDouble();
		
		kilos = 0.454;
		
		ceviri = pound * kilos;
		
		System.out.println(pound + " Pound " + ceviri + " Kilodur. " );
		

	}

}
