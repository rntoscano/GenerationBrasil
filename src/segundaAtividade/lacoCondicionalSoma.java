package segundaAtividade;

import java.util.Scanner;

public class lacoCondicionalSoma {

		public static void main(String[] args) {
			Float numeroa, numerob, numeroc;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o primeiro número (A)");
			numeroa = leia.nextFloat();
			
			System.out.println("Digite o segundo número (B)");
			numerob = leia.nextFloat();
			
			System.out.println("Digite o terceiro número (C)");
			numeroc = leia.nextFloat();
			
			float resultado = numeroa + numerob;
			
			if(resultado > numeroc) {
			System.out.println("A soma de A + B é maior que C");
			}
			
			else if(resultado == numeroc) {
			System.out.println("A soma de A + B é igual C");
				
			}
			
			else {
			System.out.println("A soma de A + B é menor que C");
			
		}
		}
	}