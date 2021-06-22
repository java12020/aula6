package br.com.fuctura;

public class Aluno {
	//atributos => variáveis
	String nome; //null
	int idade; //0
	double peso; //0.0
	
	public Aluno() {
		
	}
	
	//nomeDoAluno = Fuctura
	public Aluno(String nomeDoAluno) {
		nome = nomeDoAluno; //nome = Fuctura
	}
	
	//idadeDoAluno = 20; entrada ela vai receber todos os valores que digitarmos no construtor				
	public Aluno(int idadeDoAluno) {
		System.out.println("Invocando construtor que recebe inteiro");
		idade = idadeDoAluno;
	}
	
	//nomeDoAluno = "Futura" e idadeDoAluno=20
	public Aluno(String nomeDoAluno, int idadeDoAluno) {
		nome = nomeDoAluno;
		idade = idadeDoAluno;
	}
	
	public Aluno(double peso) {
		System.out.println("invocando construtor com parâmetro do tipo double");
	}
	
}
