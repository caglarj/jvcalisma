package OdevlerB3;

import java.util.Scanner;

public class SimpleElseIf {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		while (true) { // döngü ekledim.

			System.out.println(" Ders puaninizi giriniz: (1 ile 100 arasinda)");

			int dersNote = klavye.nextInt();

			if (dersNote >= 90) {
				System.out.println("Ders notunuz A ");
			} else if (dersNote >= 80) {
				System.out.println("Ders Notunuz B");
			} else if (dersNote >= 70) {
				System.out.println("Ders Notunuz C");
			} else if (dersNote >= 60) {
				System.out.println("Ders Notunuz D");
			} else if (dersNote >= 50) {
				System.out.println("Ders Notunuz F");
			}

		}

	}

}
