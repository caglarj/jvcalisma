package OdevlerB3;

import java.util.Scanner;

public class ToplamAraSinavi {

	public static void main(String[] args) {

		int sayi1 = (int) (Math.random() * 100);
		int sayi2 = (int) (Math.random() * 100);
	
		System.out.println(sayi1 + " + " + sayi2 + " = ?");
		Scanner inp  = new Scanner(System.in);
		
		int toplam = inp.nextInt();
		
		if (sayi1 + sayi2 == toplam) {
			System.out.println("Dogru Cevap");
		}
			else { System.out.println(" Yanlış Cevap ");
}
	
}
}