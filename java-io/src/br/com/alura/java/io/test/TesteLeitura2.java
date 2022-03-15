package br.com.alura.java.io.test;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8"); 
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);	
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular  = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d, %s: %08.2f",
												tipoConta, agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
			
			linhaScanner.close();
			
//			String[] valores = linha.split(",");
////			System.out.println(Arrays.toString(valores));
//			System.out.println(valores[3]);
		}
		scanner.close();
	}
}
