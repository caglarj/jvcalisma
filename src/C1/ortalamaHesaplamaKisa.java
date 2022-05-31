package Bolum01;


/** asagıda örnekleri verilen ortalama isleminde c, c++ ve javada double komutu guvenilmez olup bunun 
 * için bir class kullanılacak. şimdilik kod yazma alıştırmaları ve algoritma için bu örnekler
 * yeterli.
 * double komutunda. (1.1 + 1.2 + 1.3 )/3 = 2.2 olması gereken deger double kullanımından dolayı 2.199999997 gibi
 * tam olmayan bir sonuca eşitlenir. bankacılık vb. işlemlerde çok büyük
 * sorunlara yol açar.
 * 

********** import java.util.Scanner;
********** import java.util.*;

Öncelikle dersime geçmeden önce Java’da import kullanımından bahsedelim. 
import Java’da dahil etmek anlamında kullanılmaktadır. Bizde import anahtar kelimesini kullanarak 
programımıza farklı kütüphaneler ve classlar dahil edebiliriz.


İki çeşit kullanımı vardır. Birinci kullanımı direk kullanacağımız 
Class’ı dahil etmek. Mesala java.util paketi altında onlarca Class bulunmaktadır.
(List,ArrayList,Scanner,Random,Date ..). Bunları tek tek uygulamamıza aşağıdaki gibi dahil edebiliriz.
 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

İkinci kullanımı ise direk paketi dahil edebiliriz.Böylelikle o paket altındaki tüm class’ları kullanabiliriz. 
Bunuda aşağıdaki şekilde yapabiliriz.
import java.util.*;

 * 
 */

import java.util.Scanner;
import java.util.*;

public class ortalamaHesaplamaKisa {

	public static void main(String[] args) {
		Scanner deger = new Scanner(System.in);
		
		System.out.println(" 5 sayinin toplamı, carpimı ve ortalamasini hesaplak icin sayi gir : ");
		
		double s1 = deger.nextDouble();
		double s2 = deger.nextDouble();
		double s3 = deger.nextDouble();	
		double s4 = deger.nextDouble();	
		double s5 = deger.nextDouble();	
		double toplam;
		double ortalama;
		double carpim;
			
	     toplam = s1 + s2 + s3 + s4 + s5;
		System.out.println("Girilen Beş sayinin toplami :  " + toplam);
		
	    ortalama = (s1 + s2 + s3 + s4 + s5)/5;
		System.out.println("Girilen Bes sayinin ortalamasi " + ortalama);
		
		carpim = s1 *s2 *s3 * s4 * s5;
		System.out.println("Girilen Bes sayinin carpimi " + carpim);
		
	}
	
	
}
