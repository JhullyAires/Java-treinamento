// assina o contrato Autenticavel, é um Autenticavel
public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		// se diz que o Cliente TEM um AutenticacaoUtil. Ciclo da vida está conectado. Isso é a composição.
		this.autenticador = new AutenticacaoUtil();
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
