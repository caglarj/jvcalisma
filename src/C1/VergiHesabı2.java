package Bolum01;

import java.util.Scanner;

public class VergiHesabı2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Satis fiyatini giriniz ");
		
		double fiyat = input.nextDouble();
		
		double tax = fiyat * 0.06;
		
		System.out.println(" Satis fiyatında ki eklenecek vergi " + (int)(tax * 100) / 100.0);
		
		
	//burdaki örnekte int deönüşümü dikkat. kitap sayfa 58
		
		/*
		 * 
		 * 	tax * 100 is 1185.3
		 	(int)(tax * 100) is 1185
			(int)(tax * 100) / 100.0 is 11.85
		 * */
		
	}

}
