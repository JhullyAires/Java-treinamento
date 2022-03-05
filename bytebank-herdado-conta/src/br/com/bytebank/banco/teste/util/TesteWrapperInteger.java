package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

//		// Array de tipo primitivo
//		int[] idades = new int[5];
//		
//		// Array de referencias
//		String[] nomes = new String[5];
		
		int idade = 29; // Integer
		
		// Por baixo dos panos o Java faz:
		Integer idadeRef = Integer.valueOf(29);	// Autoboxing
		
		System.out.println(idadeRef.doubleValue()); // Unboxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); // Unboxing
		
		String s = args[0]; // "10"

//		Integer numero = Integer.valueOf(s);
		// OU
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		// Porém APENAS existem listas e coleções de REFERENCIAS
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);  // Autoboxing
		
		
		
	}

}
