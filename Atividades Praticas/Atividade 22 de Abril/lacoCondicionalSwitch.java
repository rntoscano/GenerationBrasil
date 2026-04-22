package segundaAtividade;

import java.util.Scanner;

public class lacoCondicionalSwitch {

	public static void main(String[] args) {

		int item;
		int quantidade;
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println(" 1 Cachorro Quente");
		System.out.println(" 2 X-Salada");
		System.out.println(" 3 X-Bacon");
		System.out.println(" 4 X-Bauru");
		System.out.println(" 5 Refrigerante");
		System.out.println(" 3 Suco de laranja");
		
		System.out.println("Digite Código do Produto");
		item = leia.nextInt();
		
		System.out.println("Quantidade");
		quantidade = leia.nextInt();
		
		float preco = 0;
		
		switch (item) {
		case 1:
			preco = 10.00f;
			break;
		 case 2:
             preco = 15.00f;
             break;
         case 3:
             preco = 18.00f;
             break;
         case 4:
             preco = 12.00f;
             break;
         case 5:
             preco = 8.00f;
             break;
         case 6:
             preco = 13.00f;
             break;
         default:
             System.out.println("Código inválido!");
     }

     System.out.println("Valor: R$ " + (quantidade * preco));
	}
}