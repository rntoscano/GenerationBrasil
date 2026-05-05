package lacoCondicional;

import java.util.Scanner;

public class ExemploElse {

	public static void main(String[] args) {
		Float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
		System.out.println("Parabéns, pessoa participante aprovado");
		}
		
		else {
		System.out.println("Infelizmente, pessoa participante foi reprovado");
		
	}
	}
}
