package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		// String está criando um objeto, porém não precisando do new
		String nome = "Alura"; // object literal imutavel
//		String maPratica = new String("Alura");
		
		System.out.println(nome.length());
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		char c = nome.charAt(0);
		System.out.println(c);
		
		// imutabilidade: para alterar um objeto você precisa criar uma nova String
		String outra = nome.replace("Al", "aL"); // com aspas dublas e mais de uma letra
		
//		String vazio = "";
//		System.out.println(vazio.isEmpty());
		
//		String vazio = " ";
//		String outroVazio = vazio.trim();
//		System.out.println(outroVazio.isEmpty());
		
		String vazio = "   Alura   ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio);
		System.out.println(outroVazio);
		
		System.out.println(vazio.contains("Alu"));

		
//		char c = 'A'; // com aspas simples e uma única letra
//		char d = 'a';
//		String outra = nome.replace(c, d);

//		String outra = nome.toLowerCase();
//		String outra = nome.toUpperCase();
				
//		System.out.println(nome);
//		System.out.println(outra);

	}

}
