package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import entity.Carrinho;
import entity.Produto;


public class AdicionarServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		Produto p = Produto.getProdutoById(id);
		
		HttpSession session = request.getSession();
		
		
		Carrinho carrinho = (Carrinho)session.getAttribute("carrinho");
		
		if(carrinho == null) {
			carrinho = new Carrinho();
			session.setAttribute("carrinho", carrinho);
		}
		
		carrinho.add(p);
		
		request.getRequestDispatcher("/Listar").forward(request, response);
		
	}

}
