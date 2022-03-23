import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStringsComJava8 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("alura online");
		palavras.add("editora intriseca");
		palavras.add("caelum");

//		// Lambda equivalente a classe anonima
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

		// Lambda mais sucinta
		// Lambda consegue ser convertido para uma interface funcional
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// E também equivalente a:
		palavras.sort(Comparator.comparing(s -> s.length())); // significa algo como: palavras ordene comparando o
																// tamanho do string
		// OU
		palavras.sort(Comparator.comparing(String::length)); // significa algo como: palavras ordene comparando o
																// tamanho do string

		Function<String, Integer> funcao = String::length;
		// EQUIVALENTES
		Function<String, Integer> funcao2 = s -> s.length();

		System.out.println(palavras);

		// Lambda
		palavras.forEach(s -> System.out.println(s));

//		// Equivalente a:
//		Consumer<String> impressor = s -> System.out.println(s);
//		palavras.forEach(impressor);

		// E também equivalente a:
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		//
		palavras.forEach(System.out::println);
	}
}