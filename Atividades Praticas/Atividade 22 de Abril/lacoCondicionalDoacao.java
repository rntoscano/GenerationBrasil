package segundaAtividade;

import java.util.Scanner;

public class lacoCondicionalDoacao {

	public static void main(String[] args) {
		int idade;
		boolean doacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Nome do doador: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? (true/false)");
		doacao = leia.nextBoolean();
		

	
		
		 if (idade >= 18 && idade <= 69) {

	            if (idade >= 60 && doacao) {
	                System.out.println(nome + " NÃO está apto para doar sangue.");
	            } else {
	                System.out.println(nome + " está apto para doar sangue.");
	            }

	        } else {
	            System.out.println(nome + " NÃO está apto para doar sangue.");
	        }
	}
}