package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// para transformar um objeto em um fluxo e dps em bits e bytes
//		String nome = "Jhully Aires";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);  // para serializar a string nome
//		oos.close();
		
		// para transformar os bits e bytes em um fluxo e depois em um objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject(); // se faz um cast porque o readObject devolve uma coisa mais generica
		ois.close();
		System.out.println(nome);
	}
}
