package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDesserializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		 para transformar os bits e bytes em um fluxo e depois em um objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject(); // se faz um cast porque o readObject devolve uma coisa mais generica
		ois.close();
		System.out.println(cc.getTitular());
		System.out.println(cc.getSaldo());


	}
}
