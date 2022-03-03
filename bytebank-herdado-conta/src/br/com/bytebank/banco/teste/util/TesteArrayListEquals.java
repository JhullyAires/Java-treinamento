package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// GENERICS <>
		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(22, 67);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 67);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
	
		// mais atualizado e clean
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}
