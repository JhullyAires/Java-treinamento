// contrato Autenticavel
	// quem assinar esse contrato, precisa implementar e não pode ter extends, mas sim implements
		// metodo setSenha
		// meto autentica
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}
