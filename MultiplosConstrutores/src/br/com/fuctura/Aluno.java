package br.com.fuctura;

public class Aluno {
	String nome;
	int idade;
	
	public Aluno() {
		
	}
	
	public Aluno(String nomeDoAluno) {
		nome = nomeDoAluno;
	}
	
	public Aluno(int idadeDoAluno) {
		idade = idadeDoAluno;
	}
	
	public Aluno(String nomeDoAluno, int idadeDoAluno) {
		nome = nomeDoAluno;
		idade = idadeDoAluno;
	}
	
}
