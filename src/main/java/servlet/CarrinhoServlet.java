package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import entity.Carrinho;
import entity.Produto;

@WebServlet("/Carrinho")
public class CarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");
		
		List<Produto> produtos = carrinho.getProdutos();
		
		request.setAttribute("produtos", produtos);
	
		request.getRequestDispatcher("/carrinho.jsp").forward(request, response);
	}

}
