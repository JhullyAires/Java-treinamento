package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
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
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		}); // para cada aluno A eu faço
//		
//		// usando forEach
//		for(Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		// usando a forma mais antiga chamado Iterator:
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		System.out.println("O aluno " + a1 + "está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno silva = new Aluno("João Silva", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(silva));

		System.out.println("O a1 é equals ao turini?");
		System.out.println(a1.equals(silva));
		
		// se o a1 for equals ao turini, obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode() == silva.hashCode());
	}
}
