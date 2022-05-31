package Odevler;

import java.util.Scanner;

public class cylinderArea {

	public static void main(String[] args) {

		System.out.println("Silindirin alanini ve hacmini hesaplayalim :");
		Scanner input = new Scanner(System.in);

		double pi = 3.14159;
		double area;
		double hacim;
		
		

		System.out.println("Silindirin alanini hesaplamak icin yari cap  ve uzunluk giriniz: ");
		double v1 = input.nextDouble(); 
		double v2 = input.nextDouble();
		
		

		area = v1 * v1 * pi;
		
		hacim = area * v2;

		System.out.println("Silindirin alanını: " + (int) area * 100 / 100.0);
		System.out.println("Silindirin hacmi: " + hacim );
		

}
}