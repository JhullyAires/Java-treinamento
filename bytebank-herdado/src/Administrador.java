// Administrador � um Funcionario, Administrador herda classe Funcionario, assina o contrato Autenticavel, � um Autenticavel
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Administrador() {
		// se diz que o Administrador TEM um AutenticacaoUtil. Ciclo da vida est� conectado. Isso � a composi��o.
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
}
