package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		// GENERICS
		// especificando entre <> que o sistema SÓ aceita referencia do tipo <Conta>
//		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		List<Conta> lista = new ArrayList<Conta>();

		
		//OU a variação/simplificação que entrou no java 1.7 : 
//		ArrayList<Conta> lista = new ArrayList<>();
		
//		Nem sequer compila por conta da ordem acima do array ser apenas de <Conta>
//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(22, 67);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 988);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 455);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------------");
		
		//mesmo resultado mas mais atualizado e clean
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
