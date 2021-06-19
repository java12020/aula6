package br.com.fuctura;

public class TesteMultiplosContrutoresAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		Aluno a2 = new Aluno(20);
		
		Aluno a3 = new Aluno("Maria");
		
		Aluno a4 = new Aluno("João", 30);
		
		
		System.out.println("Aluno a1 = [nome: " + a1.nome + ", idade: " + a1.idade + "]" );
		System.out.println("Aluno a2 = [nome: " + a2.nome + ", idade: " + a2.idade + "]" );
		System.out.println("Aluno a3 = [nome: " + a3.nome + ", idade: " + a3.idade + "]" );
		System.out.println("Aluno a4 = [nome: " + a4.nome + ", idade: " + a4.idade + "]" );
	}
}
