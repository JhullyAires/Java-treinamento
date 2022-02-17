// Gerente é um Funcionario, Gerente herda classe Funcionario, assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		// se diz que o Gerente TEM um AutenticacaoUtil. Ciclo da vida está conectado. Isso é a composição.
		this.autenticador = new AutenticacaoUtil();
	}
	
	// reescrita do código da classe mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
		// super significa que esse atributo não está definido nessa classe, mas sim na classe mãe
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
