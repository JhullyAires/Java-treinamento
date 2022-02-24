package br.com.bytebank.banco.teste;

public class TesteArraysDePrimitivos {

	// array [], E tem tamanho FIXO
	public static void main(String[] args) {
		
		int[] idades = new int[5]; // Inicializa o array com valores padroes (0)
		
//		------------ LAÇO FOR -------------
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
//		------------ --------------
//		idades[0] = 29;
//		idades[1] = 19;
//		idades[2] = 25;
//		idades[3] = 31;
//		idades[4] = 76;
//		
//		int idade = idades[4];
//		System.out.println("idade: " + idade);
//		
//		System.out.println(idades.length);
		
		
		

	}

}
