package Bolum01;

import java.util.Scanner;

public class ortalamaHesaplama {

	public static void main (String []args ) {
		
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in); 
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);
		Scanner e = new Scanner(System.in);
		
		double sayi1;
		double sayi2;
		double sayi3;
		double sayi4;
		double sayi5;
		double toplam;
		double carpim;
		double ortalama;
		
		
		
		System.out.println("ilk sayiyi giriniz : ");
		
			sayi1 = a.nextDouble();
			
		System.out.println("ikinci sayiyi giriniz : ");
			
			sayi2 = b.nextDouble();
			
		System.out.println("ucuncu sayiyi giriniz : ");
			
			sayi3 = c.nextDouble();
			
		System.out.println("dorduncu sayiyi giriniz : ");
			
			sayi4 = d.nextDouble();	
		
		System.out.println("besinci sayiyi giriniz : ");
			
			sayi5 = e.nextDouble();
			
			
			ortalama = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;	
			
			System.out.println("Girilen Bes Sayinin Aritmetik ortalamasi :" + ortalama );
			
			
			toplam = sayi1 + sayi2 + sayi3 + sayi4 + sayi5;
			
			System.out.println("Girilen Bes Sayinin toplami :" + toplam );
			
			carpim = sayi1 * sayi2 * sayi3 * sayi4 * sayi5;
			
			System.out.println("Girilen Bes Sayinin carpimi :" + carpim );
			
								

	}	
}
