package lacoRepeticao;

import java.util.Scanner;

public class exemploFor {

	public static void main(String[] args) {
		int contador;
		String nome;
		Scanner leia = new Scanner(System.in);
		
		for(contador = 1; contador < 4; contador ++) {
			System.out.println("Digite o " + contador + " nome: ");
			nome = leia.nextLine();
			System.out.println("O " + contador + " nome é " + nome + "\n" );
					
		}
		// TODO Auto-generated method stub

	}

}
