// EditorVideo é um Funcionário, Gerente herda classe Funcionario
public class EditorVideo extends Funcionario {
	
	// reescrita do código da classe mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de Videos");
		// super significa que esse atributo não está definido nessa classe, mas sim na classe mãe
		return 150;
	}
}
