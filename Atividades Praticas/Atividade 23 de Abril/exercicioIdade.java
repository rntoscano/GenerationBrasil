package terceiraAtividade;

import java.util.Scanner;

public class exercicioIdade {

	public static void main(String[] args) {

        Scanner guarda = new Scanner(System.in);

        int numero = 0;
        int menor = 0;
        int maior = 0;

        
        
        while (numero >= 0) {
        

            System.out.print("Digite a idade: ");
            numero = guarda.nextInt();

            if (numero > 50) {
                maior++;
            } 
            if (numero > 0 && numero < 21) {
                menor++;
            }
            if( numero < 0) {
            	break;
            }
      
        }
        
        

        System.out.println("Total de pessoas maiores de 50 anos: " + maior);
        System.out.println("Total de pessoas menores de 21 anos: " + menor);


    }
}
