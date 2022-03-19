package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		System.out.println("----------USANDO FOREACH-------------");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("----------USANDO LAMBDA--------------");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
}
