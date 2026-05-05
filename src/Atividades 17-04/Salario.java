package Atividades;

import java.util.Scanner;
import java.util.Locale;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Valor do Salário ");
		float a = sc.nextFloat();
		
		System.out.print("Valor do Abono ");
		float b = sc.nextFloat();
		
		
		float Novosalário = a + b;
		
		System.out.print ("Novo Salário " + Novosalário);
	}
}
