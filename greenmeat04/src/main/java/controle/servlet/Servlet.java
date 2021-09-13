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

import modelo.dao.produto.ProdutoDAO;
import modelo.dao.produto.ProdutoDAOImpl;
import modelo.entidades.produtos.Produto;
import modelo.entitidades.usuarios.information.Contato;
import modelo.exceptions.InvalidFieldException;

@WebServlet("/")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ProdutoDAO produtoDAO;

	public void init() {
		produtoDAO = new ProdutoDAOImpl();
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

			case "/inserir-produto":
				inserirProduto(request, response);
				break;

			case "/deletar-produto":
				deletarProduto(request, response);
				break;

			case "/editar-produto":
				mostrarFormularioEditarProduto(request, response);
				break;

			case "/atualizar-produto":
				atualizarProduto(request, response);
				break;

			default:
//				listarProdutos(request, response);
				break;
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		} catch (InvalidFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	private void listarProdutos(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//
//		List<Produto> produtos = produtoDAO.recuperarProdutos();
//		request.setAttribute("contatos", produtos);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-produto.jsp");// pagina de listar produto
//																							// virá aqui
//		dispatcher.forward(request, response);
//	}

	private void mostrarFormularioNovoProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("form-produto.jsp"); // formulario do produto virá
																							// aqui
		dispatcher.forward(request, response);
	}

	// INCOMPLETO
	private void mostrarFormularioEditarProduto(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Produto produto = produtoDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-contato.jsp");
//		request.setAttribute("contato", contato);
		dispatcher.forward(request, response);
	}

	private void inserirProduto(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		float precoCusto = Float.parseFloat(request.getParameter("precoCusto"));
		float precoVenda = Float.parseFloat(request.getParameter("precoVenda"));
		String tipoCarne = request.getParameter("tipoCarne");
		produtoDAO.inserirProduto(new Produto(nome, descricao, tipoCarne, precoCusto, precoVenda));
		response.sendRedirect("listar");
	}

	private void atualizarProduto(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		float precoCusto = Float.parseFloat(request.getParameter("precoCusto"));
		float precoVenda = Float.parseFloat(request.getParameter("precoVenda"));
		String tipoCarne = request.getParameter("tipoCarne");
		produtoDAO.atualizarProduto(new Produto(nome, descricao, tipoCarne, precoCusto, precoVenda));
		response.sendRedirect("listar");
	}

	private void deletarProduto(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Produto produto = produtoDAO.recuperarPorId(id);
		produtoDAO.deletarProduto(produto);
		response.sendRedirect("listar"); // aqui a pagina inicial ou de produtos
	}
}