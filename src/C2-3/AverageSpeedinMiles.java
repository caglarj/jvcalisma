package Odevler;

public class AverageSpeedinMiles {
	public static void main(String[] args) {

		double yol;
		double zaman;
		double hiz;
		double ceviri;
		double MiltoKm;

		yol = 14;
		zaman = 45.50;

		hiz = yol / zaman;
		System.out.println(" Dakikada kosulan yol " + hiz);

		ceviri = hiz * 60;

		System.out.println(" Km/H : " + ceviri);

		System.out.println("Mil / h " + ceviri / 1.6);

	}

}
