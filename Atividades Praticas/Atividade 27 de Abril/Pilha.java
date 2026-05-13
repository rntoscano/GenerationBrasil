package Collection;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		int opcao;
		String livro;

		do {

			System.out.println("\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                1 - Adicionar Livro                  ");
			System.out.println("                2 - Listar Livros                    ");
			System.out.println("                3 - Retirar Livro                    ");
			System.out.println("                0 - Sair                             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");

			System.out.print("\nDigite uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:

				System.out.print("\nDigite o nome do livro: ");
				livro = leia.nextLine();

				pilha.push(livro);

				System.out.println("\nLivro adicionado!");

				System.out.println("\nPilha: ");
				for (String item : pilha) {
					System.out.println(item);
				}

				break;

			case 2:

				System.out.println("\nLista de Livros na Pilha:\n");

				for (String item : pilha) {
					System.out.println(item);
				}

				break;

			case 3:

				if (pilha.isEmpty()) {

					System.out.println("\nA Pilha está vazia!");

				} else {

					pilha.pop();

					System.out.println("\nUm Livro foi retirado da pilha!");

					System.out.println("\nPilha: ");
					for (String item : pilha) {
						System.out.println(item);
					}
				}

				break;

			case 0:

				System.out.println("\nPrograma Finalizado!");

				break;

			default:

				System.out.println("\nOpção inválida!");

			}

		} while (opcao != 0);

}
}