package Odevler;

import java.util.Scanner;

public class bahsisHesaplama {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Toplam hesap + Bahsis Hesapala ");
		

	double hesap, bahsisy, toplam, bahsis;			
		
		
		System.out.println("Hesap :"  );
		hesap= input.nextDouble();
		
		System.out.println("Bahsis % :"  );
		bahsisy= input.nextDouble();
		
		
		
		bahsis = hesap * bahsisy / 100;
				
		toplam = hesap + bahsis ;
		
		System.out.println("Toplam :" + toplam );

		
		


	

	
}
}
