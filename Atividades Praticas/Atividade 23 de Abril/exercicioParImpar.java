package terceiraAtividade;

import java.util.Scanner;

public class exercicioParImpar {

	 public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);

	        int numero;
	        int par = 0;
	        int impar = 0;

	        for (int i = 1; i <= 10; i++) {

	            System.out.print("Digite o " + i + "º número: ");
	            numero = leia.nextInt();

	            if (numero % 2 == 0) {
	                par++;
	            } else {
	                impar++;
	            }
	        }

	        System.out.println("\nTotal de números pares: " + par);
	        System.out.println("Total de números ímpares: " + impar);

	     
	    }
	}
	