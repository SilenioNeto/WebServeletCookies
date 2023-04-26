package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookies")
public class Cookies extends HttpServlet{
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) {
	      try{
		Cookie nome = new Cookie("nome",request.getParameter("nome"));
		Cookie cpf = new Cookie("cpf",request.getParameter("cpf"));
		Cookie curso = new Cookie("curso",request.getParameter("curso"));
		Cookie semestre = new Cookie("semestre", request.getParameter("semestre"));
		Cookie profissao = new Cookie("profissao",request.getParameter("profissaos"));
		Cookie cargo = new Cookie("cargo", request.getParameter("cargo"));
		
		response.addCookie(nome);
		response.addCookie(cpf);
		response.addCookie(curso);
		response.addCookie(semestre);
		response.addCookie(profissao);
		response.addCookie(cargo);
		
//		cpf.setMaxAge(0);
//		curso.setMaxAge(0);
//		semestre.setMaxAge(0);
//		profissao.setMaxAge(0);
//		cargo.setMaxAge(0);
//		nome.setMaxAge(0);
		PrintWriter writer = response.getWriter();			
		writer.append( " <HTML>  <BODY> " );
		writer.append( " <H1> Enviado!</H1>" );
		writer.append( "</BODY> </HTML>  " );
	       } catch (IOException e){
	e.printStackTrace();	
	       } 
	   } 
	}

