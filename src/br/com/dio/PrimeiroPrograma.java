package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 3;
		int b = 4;
		System.out.println("Hello people! " + (a+b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
	
}
