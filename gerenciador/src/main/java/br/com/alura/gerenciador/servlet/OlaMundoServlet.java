package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi
@WebServlet(urlPatterns = "/oi")  // mapeamento
public class OlaMundoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>ola mundo, parabens!</h1> <h3>vc escreveu o primeiro servlets.</h3>");
		out.println("</body>");
		out.println("</html>");

		System.out.println("o servlet OlaMundoServlet foi chamado");  // aparece no console
	}
	
}
