package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

		List<Aula> aulasImutáveis = javaColecoes.getAulas();
		System.out.println(aulasImutáveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutáveis);  // passa o nome da classe no construtor para clonar os objetos
		
		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println(javaColecoes.getTempoTotal());
	}
}
