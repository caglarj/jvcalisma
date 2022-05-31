package Bolum01;

public class TurDonusturme {
	
	public static void main(String[] args) {
		
		/* int 32 bit long 64 bit. 32 bitten yani intten 64 bite donusturme yapılabilir. 
		 * kapasite farklılığı olduğu için 32 bitten --> 64 bite dönüşürken 
		 * 
		 * 
		 
		 */
		
		
		int i = 5;
		
		long l = i;
		
		i = (int)l;
		
		System.out.println(i);
		System.out.println(l);
		
		
		l = 2148000000L; //dil burada bu sayıyı int olarak algılıyor sonuna L koyarak bunun long olduğunu ifade ediyoruz.
		
		i = (int)1; // tur değiştirme.
		
		System.out.println(i);
		System.out.println(l);
	
		int sayi = 2_147_483_647;// büyük sayılar yazılırken _ kullanılması okunurlugu artırır.
		
		// int taşması örneği : 2_147_483_647 + 1 işleminin sonucu - değerlerde bir şeyler çıkacak
		//bu duruma int taşması denir. compale yada runtime hatası olmayıp mantık hatasıdır. ve kritiktir.
		
		
		sayi = sayi + 1;
		
		System.out.println(sayi);//
		
		// bak : bölüm 5 numerik işlemler 1:45 dakika.
		
		
		/* not: 
		 * 
		 * her zaman bir değişkene atma yapılmadan değişkenin değeri değişmez.
		 * atama opr. muhatap değil.
		 * 
		
		double d = 4.5;
		int i = (int)d; 
		*/
		
		double d = 4.5;
		int g = (int)d;
		System.out.println(d);
		
		
		
		
		
	}
	
	
	
	
	

}
