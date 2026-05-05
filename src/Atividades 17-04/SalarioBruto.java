package Atividades;

import java.util.Scanner;
import java.util.Locale;

public class SalarioBruto {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Sálario Bruto ");
		float a = sc.nextFloat();
		
		System.out.print("Adicional Noturno ");
		float b = sc.nextFloat();
		
		System.out.print("Horas Extras ");
		float c = sc.nextFloat();
		
		System.out.print("Descontos ");
		float d = sc.nextFloat();
		
		
		float calculo= a + b + (c * 5) - d;
		
		System.out.print ("Sálario Líquido " + calculo);
	}
}

