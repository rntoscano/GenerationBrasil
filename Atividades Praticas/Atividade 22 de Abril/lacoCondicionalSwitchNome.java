package segundaAtividade;

import java.util.Locale;
import java.util.Scanner;

public class lacoCondicionalSwitchNome {	public static void main(String[] args) {

	int cargo;
	float salario;
	Scanner leia = new Scanner(System.in);
	leia.useLocale(Locale.US);
	
	System.out.println("Nome do Funcionario: ");
	String nome = leia.nextLine();

	System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
	System.out.println(" 1 Gerente");
	System.out.println(" 2 Vendedor");
	System.out.println(" 3 Supervisor");
	System.out.println(" 4 Motorista");
	System.out.println(" 5 Estoquista");
	System.out.println(" 6 Técnico de TI");
	
	System.out.println("Digite o cargo ");
	cargo = leia.nextInt();
	
	System.out.println("Valor do salário a ser reajustado: ");
	salario = leia.nextFloat();
	
	float porcentual = 0;
	String nomeCargo = "";
	
	switch (cargo) {
	case 1:
		nomeCargo = "Gerente";
		porcentual = 0.10f;
		break;
	 case 2:
		 nomeCargo ="Vendedor";
         porcentual = 0.07f;
         break;
     case 3:
    	 nomeCargo ="Supervisor";
    	 porcentual = 0.09f;
         break;
     case 4:
    	 nomeCargo ="Motorista";
    	 porcentual = 0.06f;
         break;
     case 5:
    	 nomeCargo ="Estoquista";
    	 porcentual = 0.05f;
         break;
     case 6:
    	 nomeCargo ="Técnico de TI";
    	 porcentual = 0.08f;
         break;
     default:
         System.out.println("Código inválido!");
 }
	float novoSalario = salario + (salario * porcentual);
	
	System.out.println("Nome do colaborador: " + nome);
	System.out.println("Cargo: " + nomeCargo);
 System.out.println("Salário: " + novoSalario);
}
}