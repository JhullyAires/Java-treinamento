package br.com.bytebank.banco.teste.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {
		
		Cliente cliente =  new Cliente();
		cliente.setNome("Jhully Emilly");
		cliente.setProfissao("Dev");
		cliente.setCpf("11122233344");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		// para transformar um objeto em um fluxo e dps em bits e bytes
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);  // para serializar
		oos.close();

	}

}
