package Odevler;

import java.util.Scanner;

public class FaizHesaplama {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Yillik faiz oranini giriniz : (Orn: 4.5)");
		double yillikFaizOrani = klavye.nextDouble();
		
		System.out.println("Kac yilda odamek istiyorsunuz : (Orn : 5)");
		
		int yil = klavye.nextInt();
		
		System.out.println("Borc alinacak miktar : (Orn: 1567,98)");
		double borcmiktari = klavye.nextDouble();
		
		double aylikFaizOrani = yillikFaizOrani / 1200;
		
		double aylikOdemeMiktari = (borcmiktari * aylikFaizOrani) / (1 - (1 / Math.pow(1 + aylikFaizOrani, yil *12 )));

		double toplamBorc = aylikOdemeMiktari * 12 * yil;
		
		System.out.println("Aylik odeme miktari: " + (int)(aylikOdemeMiktari * 100) / 100.0);//tür değiştirmeye dikkat.
		System.out.println("Toplam odecek miktar: " + (int)(toplamBorc * 100 ) / 100.0);
	}

}
