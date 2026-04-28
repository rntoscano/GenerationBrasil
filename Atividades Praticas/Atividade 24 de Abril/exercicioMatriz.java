package quartaAtividade;

import java.util.Scanner;

public class exercicioMatriz {

		public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);

	        int[][] matriz = new int[3][3];

	  
	        for (int i = 0; i < 3; i++) {
	            for (int y = 0; y < 3; y++) {
	                System.out.print("Digite um número: ");
	                matriz[i][y] = leia.nextInt();
	            }
	        }

	        int somaP = 0;
	        int somaS = 0;

	        System.out.println("\nElementos da Diagonal Principal:");
	        for (int i = 0; i < 3; i++) {
	            for (int y = 0; y < 3; y++) {

	                if (i == y) {
	                    System.out.print(matriz[i][y] + " ");
	                    somaP += matriz[i][y];
	                }
	            }
	        }

	        System.out.println("\nElementos da Diagonal Secundária:");
	        for (int i = 0; i < 3; i++) {
	            for (int y = 0; y < 3; y++) {

	                if (i + y == 2) {
	                    System.out.print(matriz[i][y] + " ");
	                    somaS += matriz[i][y];
	                }
	            }
	        }

	        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaP);
	        System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaS);
	    }
	}