public class TesteConta {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		// conta está inconsistente: 
		// conta.setAgencia(-50);
		// conta.setNumero(-330);
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("O total de contas é: " + conta.getTotal());
	}
}
