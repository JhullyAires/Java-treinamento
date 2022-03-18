package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	// atributos
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // read only
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// FOR TRADICIONAL
//	public void getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
//	}

	// USANDO EVOLUÇÕES DO JAVA 8
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();

	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "aulas: " + this.aulas + "]";
	}
}
