package Odevler;

import java.util.Scanner;

public class convertFeettoMeters {

	public static void main(String[] args) {
		System.out.println("Metreye cevirilecek olan feet olcusunu giriniz : ");
		
		Scanner input = new Scanner(System.in);
		
		
		double meter;
		double ceviri;
		
		
		double feet = input.nextDouble();

		meter = 0.305;
		
		ceviri = feet * meter;
		
	
		System.out.println(feet + " feet " + ceviri + " Metredir. ");
	
		
		
		
		
			
	}

}
