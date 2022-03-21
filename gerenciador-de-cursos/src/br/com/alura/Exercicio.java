package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {

		Map<String, Integer> pessoas = new HashMap<>();
		
		pessoas.put("Leonardo Cordeiro", 21);
		pessoas.put("Flávio Pimentel", 27);
		pessoas.put("Silvio Mattos", 19);
		pessoas.put("Romulo Henrique", 23);
		
//		pessoas.keySet().forEach(idade -> {
//			System.out.println(pessoas.get(idade));
//		});
		
		Set<String> chaves = pessoas.keySet();
		for(String nome : chaves) {
			System.out.println(nome);
		}
		
		Collection<Integer> valores = pessoas.values();
		for(Integer idade : valores) {
			System.out.println(idade);
		}
	
		Set<Entry<String,Integer>> associacoes = pessoas.entrySet();
		for(Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
	}

}
