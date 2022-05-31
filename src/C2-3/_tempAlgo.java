package OdevlerB3;

import java.util.Scanner;

public class _tempAlgo {

public static void main(String[] args) {
	
	int sayi1 = (int) (Math.random() *100);
	int sayi2 = (int) (Math.random() *100);
	
	if (sayi2>sayi1) {
		int temp = sayi1;
		sayi1 = sayi2;
		sayi2 = temp;
	}
	
	
	System.out.println( sayi1 + " - " + sayi2 + " = ? ");
	Scanner inp = new Scanner(System.in);
	int sonuc = inp.nextInt();
	
	if (sayi1 - sayi2 == sonuc) { 
		System.out.println("Sonuc Dogru");
		}
	else {
			System.out.println( "Yanlis Cevap. Dogrusu : " + sonuc );
			
		}
		
		
	}
	
	
	
	
}
	


