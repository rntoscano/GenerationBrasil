package Collection;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao;
		String nome;

		do {

			System.out.println("\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                1 - Adicionar Cliente                ");
			System.out.println("                2 - Listar Clientes                  ");
			System.out.println("                3 - Retirar Cliente da fila          ");
			System.out.println("                0 - Sair                             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");

			System.out.print("\nDigite uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:

				System.out.print("\nDigite o nome: ");
				nome = leia.nextLine();

				fila.add(nome);

				System.out.println("\nCliente Adicionado!");

				System.out.println("\nFila: ");
				for (String cliente : fila) {
					System.out.println(cliente);
				}

				break;

			case 2:

				System.out.println("\nLista de Clientes na Fila:\n");

				for (String cliente : fila) {
					System.out.println(cliente);
				}

				break;

			case 3:

				if (fila.isEmpty()) {

					System.out.println("\nA Fila está vazia!");

				} else {

					fila.remove();

					System.out.println("\nO Cliente foi Chamado!");

					System.out.println("\nFila: ");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}

				break;

			case 0:

				System.out.println("\nPrograma Finalizado!");

				break;

			default:

				System.out.println("\nOpção Inválida!");

			}

		} while (opcao != 0);

	
	}
}