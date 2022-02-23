package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.CalculadorDeImposto => FQN (Full Qualified Name)
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
