public class TesteReferencias {

	public static void main(String[] args) {
		// no lado esquerdo tem o mais genérico, e no direito o mais específico
		Gerente g1 = new Gerente();   // funciona porque o gerente é um funcionario
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
				
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
}
