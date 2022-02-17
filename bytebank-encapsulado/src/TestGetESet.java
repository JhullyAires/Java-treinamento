public class TestGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		// conta.numero = 1337    ~ NAO se usa o sinal de igual, mas sim os parênteses
		// conta.setNumero(1337); ~ Como criei um construtor, passei o valor lá encima
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		// conta.titular() = paulo;
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		// agora em duas linhas: 
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
