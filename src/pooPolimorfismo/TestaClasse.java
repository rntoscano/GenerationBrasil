package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {
		
	
		TriAtleta t = new TriAtleta("Eliane", 26, 400);
		TriAtleta t2 = new TriAtleta("João", 30, 12);
		
		
		t2.competicoesConcluidas();
		t2.competicoesConcluidas(8);
	
		//t.setNome("Queren");
		//System.out.println(t.getNome());
		
		

	}

}