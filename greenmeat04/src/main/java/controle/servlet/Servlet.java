package controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.contato.ContatoDAO;
import modelo.dao.contato.ContatoDAOImpl;
import modelo.entidades.produtos.Produto;


@WebServlet("/")
public class Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ContatoDAO dao;

	public void init() {
		dao = new ContatoDAOImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			
			switch (action) {
			
			case "/novo-produto":
				mostrarFormularioNovoProduto(request, response);
				break;
				
			case "/inserir-contato":
				inserirProduto(request, response);
				break;
				
			case "/deletar":
				deletarContato(request, response);
				break;
				
			case "/editar":
				mostrarFormularioEditarContato(request, response);
				break;
				
			case "/atualizar":
				atualizarContato(request, response);
				break;
				
			default:
				listarContatos(request, response);
				break;
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listarContatos(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		
		List<Contato> contatos1 = dao.recuperarContatos();
		request.setAttribute("contatos", contatos1);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-contato.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-produto.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioEditarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = dao.recuperarContato(new Contato(id));
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-contato.jsp");
		request.setAttribute("contato", contato);
		dispatcher.forward(request, response);
	}

	private void inserirProduto(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		float precoCusto = Float.parseFloat(request.getParameter("precoCusto"));
		
//		float precoCusto = float.class.parseFloat(request.getParameter("precoCusto"));
//		float precoVenda = request.getParameter("precoVenda");
		String tipoCarne = request.getParameter("tipoCarne");
		dao.inserirProduto(new Produto(nome, descricao, precoCusto, precoVenda, tipoCarne));
		response.sendRedirect("listar");
	}

	private void atualizarContato(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		dao.atualizarContato(new Contato(id,telefone, email));
		response.sendRedirect("listar");
	}

	private void deletarContato(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = dao.recuperarContato(new Contato(id));
		dao.deletarContato(contato);
		response.sendRedirect("listar");
	}
}