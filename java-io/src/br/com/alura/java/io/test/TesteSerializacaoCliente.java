package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente =  new Cliente();
		cliente.setNome("Jhully Emilly");
		cliente.setProfissao("Dev");
		cliente.setCpf("11122233344");
		
		
		// para transformar um objeto em um fluxo e dps em bits e bytes
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);  // para serializar
		oos.close();
		
//		// para transformar os bits e bytes em um fluxo e depois em um objeto
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject(); // se faz um cast porque o readObject devolve uma coisa mais generica
//		ois.close();
//		System.out.println(cliente.getCpf());
	}
}
