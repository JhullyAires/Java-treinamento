package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));

//		// mais comum aparecer: 
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));  // depois de alterar o return de getAulas, não funciona mais
		// porém é mais legível assim:
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

		
		System.out.println(javaColecoes.getAulas());
		
	}
}
