package Bolum01;

import java.util.Scanner;

public class orn2AlanToplama {
	public static void main(String[] args) {
	
		
		System.out.println("Alanlari hesaplanan cisimlerin toplam alanlarini bulalim");
		System.out.println("Dikdortgenin a ve b kenar degerlerini girelim");
		
		Scanner deger = new Scanner(System.in);
		
		double s1 = deger.nextDouble();
		double s2 = deger.nextDouble();
		double dikalan;
		double toplam;
		
		
		dikalan = s1 * s2;
		
		System.out.println("Degerleri verilen dikdortgenin alani :" + dikalan);
		
		
		System.out.println("Dairenin alanını hesaplamak icin yari cap girelim : ");
		double s3 = deger.nextDouble();
		double daalan;
		
		
		daalan = s3 * s3 * 3.14159;
		System.out.println("Degerleri verilen dairenin alani :" + daalan);
		
		toplam = dikalan + daalan ;
		System.out.println("Dikdortgen ve Dairenin alanlarınınn toplamı : " + toplam);
	
		
		
		
		
		
		
		
		
	
	
}
}
