package br.com.alura.main;

public class Teste {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
		
//		System.out.println(Thread.MAX_PRIORITY);
//		Thread t = new Thread(() -> System.out.println("rodando..."));
//		t.setPriority(Thread.MAX_PRIORITY);
//		t.start();
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());

	}
}
