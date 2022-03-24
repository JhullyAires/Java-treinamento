import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Pyton", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// METHOD REFERENCE
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		// LAMBDA
//		cursos.forEach(c -> System.out.println(c.getNome()));

		// calculando a soma
		int sum = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
//			.map(c -> c.getAlunos())   // ou: .map(Curso::getAlunos)
//			.forEach(total -> System.out.println(total)) //ou: .forEach(System.out::println);
			// OU
			.mapToInt(Curso::getAlunos)
			.sum();  

		System.out.println(sum);
		
		// calculando média
		cursos.stream()
			.mapToInt(c -> c.getAlunos())
			.average();
		
//		cursos = cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.findAny()
//			.ifPresent(c -> System.out.println(c.getNome()));
		
		// filtrando cursos
		cursos = cursos.stream()
			.filter(c -> c.getAlunos() >= 50)
			.collect(Collectors.toList());
		
		// ou 
		List<Curso> cursosFiltrados = cursos.stream()
			.filter(c -> c.getAlunos() >= 50)
			.collect(Collectors.toList());
		
		cursos.stream()
			.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(), 
					c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos +" alunos."));
		
	}
}
