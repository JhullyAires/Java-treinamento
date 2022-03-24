import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		// data atual com LocalDate.now
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		// criando uma data com LocalDate.of
		LocalDate olimpiadasRio = LocalDate.of(2024, Month.JUNE, 5);
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		// criando período entre duas datas
		Period periodoEntre = Period.between(hoje, olimpiadasRio);
		System.out.println(periodoEntre.getDays());
		
		// data futura + outros 4 anos
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		// formatando datas
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		// formatando datas e horas
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
	    LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));

		// criando intervalo
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
	}
}
