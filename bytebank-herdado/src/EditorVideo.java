// EditorVideo � um Funcion�rio, Gerente herda classe Funcionario
public class EditorVideo extends Funcionario {
	
	// reescrita do c�digo da classe m�e
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Editor de Videos");
		// super significa que esse atributo n�o est� definido nessa classe, mas sim na classe m�e
		return 150;
	}
}
