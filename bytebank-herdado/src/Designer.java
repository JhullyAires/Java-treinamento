// Designer é um Funcionário, Gerente herda classe Funcionario
public class Designer extends Funcionario {
	
	// reescrita do código da classe mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		// super significa que esse atributo não está definido nessa classe, mas sim na classe mãe
		return 200;
	}
}
