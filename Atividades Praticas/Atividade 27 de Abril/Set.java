package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Set {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		HashSet<Integer> numeros = new HashSet<Integer>();

	
		for (int i = 0; i < 10; i++) {

			System.out.print("Digite um número: ");
			((Collection<Integer>) numeros).add(leia.nextInt());

		}

	
		Iterator<Integer> iNumeros = ((Collection<Integer>) numeros).iterator();

		System.out.println("\nListar dados do Set:\n");

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}
}