package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Cole��es", 22));

		List<Aula> aulasImut�veis = javaColecoes.getAulas();
		System.out.println(aulasImut�veis);
		
		List<Aula> aulas = new ArrayList<>(aulasImut�veis);  // passa o nome da classe no construtor para clonar os objetos
		
		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println(javaColecoes.getTempoTotal());
	}
}
