package br.com.alura.main;

public enum Prioridade {
	
	// é uma classe normal, mas com a quantidade de objetos que ele tem

	MIN(1), NORMAL(5), MAX(10);
	
	private int valor;
	
	private Prioridade(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
