public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override     // anota��o da configura��o java que percebe sua inten�a� de sobrescrever o c�digo
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
