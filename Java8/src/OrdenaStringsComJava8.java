import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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
		palavras.sort(Comparator.comparing(s -> s.length()));  // significa algo como: palavras ordene comparando o tamanho do string
		

		System.out.println(palavras);

		// Lambda
		palavras.forEach(s -> System.out.println(s));
		
		// Equivalente a:
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);

	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}
