package br.com.fuctura;

public class TestarConstrutor {
	public static void main(String[] args) {
		
		//referenciar o objeto criado
		Aluno a1 = new Aluno("Fuctura", 20);
		
		System.out.println("Aluno a1 = [nome: " + a1.nome + ", idade: " + a1.idade + ", peso = " + a1.peso + "]" );
		
		
	}
}
