package chapter02;

import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 

    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble(); 

    // Convert Fahrenheit to Celsius
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println("Fahrenheit " + fahrenheit + " is " + 
      celsius + " in Celsius");  
    
    Scanner klavye = new Scanner(System.in);

    System.out.print("Enter a degree in Celsius: ");
    double derece = klavye.nextDouble(); 

    // Convert Fahrenheit to Celsius
    double fahrenayt = (derece * 5/9 + 32);
    
    System.out.println("Derece " + derece + " is " + 
        		fahrenayt + " in Fahrenheit");  
    
   
    
  }
}
