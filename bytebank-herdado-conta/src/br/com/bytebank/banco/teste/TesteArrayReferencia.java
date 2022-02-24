package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		
//		int[] idades = new int[5];
//		Conta[] contas = new Conta[5];  // generico
		Object[] contas = new Object[5]; //ainda mais generico
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 33);
		contas[1] = cc2;
		
		Cliente cliente = new Cliente();
		contas[2] = cliente;
		
		Object referenciaGenerica = contas[1];
		System.out.println(referenciaGenerica.getNumero());

		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = (ContaCorrente) contas[1]; // type cast, transformar um tipo generico em mais específico
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}
