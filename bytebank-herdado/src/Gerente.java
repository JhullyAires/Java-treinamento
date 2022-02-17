// Gerente � um Funcionario, Gerente herda classe Funcionario, assina o contrato Autenticavel, � um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		// se diz que o Gerente TEM um AutenticacaoUtil. Ciclo da vida est� conectado. Isso � a composi��o.
		this.autenticador = new AutenticacaoUtil();
	}
	
	// reescrita do c�digo da classe m�e
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Gerente");
		// super significa que esse atributo n�o est� definido nessa classe, mas sim na classe m�e
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		// delegar a chamada para o AutenticacaoUtil
		return this.autenticador.autentica(senha);
	}
