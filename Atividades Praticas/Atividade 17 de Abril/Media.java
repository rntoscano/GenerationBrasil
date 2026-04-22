package Atividades;

import java.util.Scanner;
import java.util.Locale;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Nota 1 ");
		float a = sc.nextFloat();
		
		System.out.print("Nota 2 ");
		float b = sc.nextFloat();
		
		System.out.print("Nota 3 ");
		float c = sc.nextFloat();
		
		System.out.print("Nota 4 ");
		float d = sc.nextFloat();
		
		
		float media= (a + b + c + d) / 4;
		
		System.out.print ("Média Final " + media);
	}
}
