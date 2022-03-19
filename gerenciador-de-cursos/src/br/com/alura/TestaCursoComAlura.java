package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAlura {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));
		
		Aluno a1 = new Aluno("João Silva", 34672);
		Aluno a2 = new Aluno("Ana Souza", 50617);
		Aluno a3 = new Aluno("Fernanda Aires", 34582);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		}); // para cada aluno A eu faço
		
		System.out.print("O aluno " + a1 + "está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
	}
}
