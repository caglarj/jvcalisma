package OdevlerB3;

import java.util.Scanner;

public class TestBooleanOpr {

	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Bir Sayi giriniz : ");
		
		int sayi = inp.nextInt();
		
		if ( sayi % 2 == 0 && sayi % 3 == 0) {
			System.out.println( " Girdiginiz sayi 2 ve 3 e tam bolunuyor. " );
		}
		
		if ( sayi % 2 == 0 || sayi % 3 == 0) {
			System.out.println( " Girdiginiz sayi 2 ve 3 e bolunuyor. ");
		}
		if ( sayi % 2 == 0 ^ sayi % 3 == 0) {
			System.out.println(" Girdiginiz Sayi 2 ve 3 e bolunuyor ancak her ikisine birden bolunmuyor. " );
			 }
		else {
		System.out.println( " Girdiginiz sayi hem 2 hem de 3 e tam bolunmuyor. "  );
			}
		
	}
}
