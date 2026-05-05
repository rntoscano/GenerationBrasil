package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclistaw{
	
	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}

	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}

	public void competicoesConcluidas() {
		
		
	}
}