public class TestaConexao {

	public static void main(String[] args) {
		
		//forma mais resumida
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		// ---------------------------------------------------------------------
		// forma embolada e extensa
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			// OPCIONAL. SEMPRE SERÁ EXECUTADO, COM OU SEM ERRO.
//			System.out.println("Finally");
//			if(con != null ) {
//				con.close();
//			}
//		}
	}
}
