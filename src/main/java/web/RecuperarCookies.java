package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResgatandoCookies")
public class RecuperarCookies extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try{
		   Cookie cookies[] = null;
		   cookies = request.getCookies();
			
		   PrintWriter writer = response.getWriter();
		   writer.append( " <HTML>  <BODY> " );
		   writer.append( " <H1> Exemplo de Cookies </H1> " );			
		   if (cookies != null) {
			String[] nomes = {
			    "nome", "cpf", "curso", "semestre", "profissao", "cargo"
			};
			for (String s: nomes) {
				for (int i = 0; i < cookies.length; i++) {
					Cookie cookie = cookies[i];
					if (cookie.getName().equals(s))
						writer.append("Nome: " + s + ",  Valor: " + cookie.getValue() + "<br>"  );
			}
			}
		   }
		   writer.append( "</BODY> </HTML> " );
		} catch (IOException e){
		   e.printStackTrace();
		}
	}
}

