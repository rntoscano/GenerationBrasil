package terceiraAtividade;

import java.util.Scanner;

public class exercicioPositivo {


	  public static void main(String[] args) {

	        Scanner guarda = new Scanner(System.in);

	        int numero;
	        int positivo = 0;

	        do {
	            System.out.println("Digite um número: \n*Digite 0 para pausar* ");
	            numero = guarda.nextInt();

	            if (numero > 0) {
	                positivo += numero;
	            }

	        } while (numero != 0);

	        System.out.println("Quantidade de números positivos: " + positivo);

	        
	    }
	}