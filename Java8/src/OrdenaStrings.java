import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("alura");
		palavras.add("editora intriseca");
		palavras.add("caelum");
		
//		Comparator<String> comparador = new ComparadorPorTamanho();
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();

//		Collections.sort(palavras, comparador);  // antiga
		palavras.sort(comparador);  // nova
		
		System.out.println(palavras);
//		
//		for (String p : palavras) {   // antiga
//			System.out.println(p);
//		}  
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);  // nova
		
	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}	
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
}
