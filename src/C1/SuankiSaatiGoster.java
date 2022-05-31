package Bolum01;


//mode oparatör örneği



public class SuankiSaatiGoster {

	public static void main(String[] args) {

		long toplamMiliSaniye = System.currentTimeMillis();

		System.out.println(" Toplam MiliSaniye =" + toplamMiliSaniye);

		long toplamSaniye = toplamMiliSaniye / 1000;

		System.out.println(" toplamSaniye =" + toplamSaniye);

		long suankiSaniye = toplamSaniye % 60;

		System.out.println(" Suan ki Saniye  =" + suankiSaniye);

		long toplamDakika = toplamSaniye / 60;
		
		System.out.println(" toplam dakika  =" + toplamDakika);
		
		long suankiDakika = toplamDakika % 60;

		System.out.println(" Suan ki Saniye  =" + suankiDakika);
		
		long toplamSaat = toplamDakika / 60;
		
		System.out.println(" toplam saat  =" + toplamSaat);
		
		long suankiSaat = toplamDakika % 24;
		
		System.out.println(" Suanki saat  =" + suankiSaat);
		
		System.out.println(suankiSaat + ":" + suankiDakika + ":" + suankiSaniye + " GMT" );
	}

}
