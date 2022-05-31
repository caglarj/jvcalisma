package Bolum01;

public class ArtirmaAzaltmaOpr {
	
	
	//Increment and Decrement Opr.
	
	public static void main(String[] args) {
		
		int i = 3;
		int j = 3;
		
		i++;
		j--;
		
		System.out.println(i);
		System.out.println(j);
		
		
		// yazılım farkılılıkları
		
		i = 3;
		j = 3;
		
		++i;
		--j;
		
		System.out.println(i);
		System.out.println(j);
		
		//  ++ önde olursa değerini artırır sonra kullanır.
		
		
		int var = 10;
		int a = var;
		
		System.out.println(a);
		
		var = 5;
		
		System.out.println(a);
	
		a = var++;
		
		System.out.println("a: " + a);
		System.out.println("var : " + var);
		
		// dikkat
		
		int once = 10;
		int b = once;
		
		System.out.println(b);
		
		once = 5;
		
		System.out.println(b);
	
		b = ++once;
		
		System.out.println("b: " + b);
		System.out.println("once : " + once);
		
		// ++ hep sonda kullan karışıklığa neden oluyor.
		
		int z = 10; 
		int newNum = 10 * z++;
		
		System.out.println("z is : " + z + ", newNum is " + newNum);
		
		/** same effect as
		
		int newNum = 10 * i ; i = i + 1;
		
		not içerisindeki gibi kodun yazılması daha iyi.
		not : ifadenin içerisinde kullanılması kodun kullanımı artırmak için önerilmiyor.
		*/
		
		i = 5; 
		j = ++i + i++ + ++i + ++i;
		System.out.println("i nin degeri " + i);
		System.out.println("J nin degeri : " + j);
		
	}

}
