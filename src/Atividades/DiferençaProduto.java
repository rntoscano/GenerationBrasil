package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class DiferençaProduto{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
	
		System.out.print("n1 ");
		float a = sc.nextFloat();
	
		System.out.print("n2 ");
		float b = sc.nextFloat();
	
		System.out.print("n3 ");
		float c = sc.nextFloat();
	
		System.out.print("n4 ");
		float d = sc.nextFloat();
	
	
		float calculo = (a * b) - (c * d) ;
	
		System.out.print ("Resultado " + calculo);
	}
}