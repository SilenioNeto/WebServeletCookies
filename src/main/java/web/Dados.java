package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dados")
public class Dados extends HttpServlet{
	private static final long serialVesionUID = 1;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	 ServletException,IOException{
	
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			String curso = request.getParameter("curso");
			String semestre = request.getParameter("semestre");
			String profissao = request.getParameter("profissao");
			String cargo = request.getParameter("cargo");
			

	}
}
