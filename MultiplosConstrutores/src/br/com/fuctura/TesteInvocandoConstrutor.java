package br.com.fuctura;

public class TesteInvocandoConstrutor {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Gol G4", 2021, 5000.0);
		
		//qual valor será impresso?
		System.out.println(c1.marca);
		System.out.println(c1.ano);
		System.out.println(c1.peso);
		
		String nome = "Fuctura";
		
		int tamanho = nome.length();
		
		System.out.println(tamanho);
	}
	
}
