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

import modelo.dao.cliente.ClienteDAO;
import modelo.dao.cliente.ClienteDAOImpl;
import modelo.dao.funcionario.FuncionarioDAO;
import modelo.dao.funcionario.FuncionarioDAOImpl;
import modelo.dao.produto.ProdutoDAO;
import modelo.dao.produto.ProdutoDAOImpl;
import modelo.entidades.produtos.Produto;
import modelo.entitidades.usuarios.Cliente;
import modelo.entitidades.usuarios.Funcionario;
import modelo.exceptions.InvalidFieldException;

@WebServlet("/")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ProdutoDAO produtoDAO;
	private ClienteDAO clienteDAO;
	private FuncionarioDAO funcionarioDAO;
	
	public void init() {
		produtoDAO = new ProdutoDAOImpl();
		clienteDAO = new ClienteDAOImpl();
		funcionarioDAO = new FuncionarioDAOImpl();
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

/////////////////////////////////

			case "/novo-cliente":
				mostrarFormularioNovoCliente(request, response);
				break;

			case "/inserir-cliente":
				inserirCliente(request, response);
				break;

			case "/deletar-cliente":
				deletarCliente(request, response);
				break;

			case "/editar-cliente":
				mostrarFormularioEditarCliente(request, response);
				break;

			case "/atualizar-cliente":
				atualizarCliente(request, response);
				break;

//				////////////////////////

			case "/novo-funcionario":
				mostrarFormularioNovoFuncionario(request, response);
				break;

			case "/inserir-funcionario":
				inserirFuncionario(request, response);
				break;

			case "/deletar-funcionario":
				deletarFuncionario(request, response);
				break;

			case "/editar-funcionario":
				mostrarFormularioEditarFuncionario(request, response);
				break;

			case "/atualizar-funcionario":
				atualizarFuncionario(request, response);
				break;

			case "/listar-funcinarios":
				listarFuncionarios(request, response);
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

	private void listarProdutos(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Produto> produtos = produtoDAO.recuperarProdutos();
		request.setAttribute("contatos", produtos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-produto.jsp");// pagina de listar produto
																							// virá aqui
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-produto.jsp"); // formulario do produto
																								// virá
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
		Float precoCusto = Float.parseFloat(request.getParameter("precoCusto"));
		Float precoVenda = Float.parseFloat(request.getParameter("precoVenda"));
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

///////////////////////

	private void mostrarFormularioNovoCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-cliente.jsp");
	}

// INCOMPLETO
	private void mostrarFormularioEditarCliente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Cliente cliente = clienteDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-cliente.jsp");
//	request.setAttribute("contato", contato);
		dispatcher.forward(request, response);
	}

	private void inserirCliente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String CPF = request.getParameter("CPF");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		// String dataNascimento = request.getParameter("dataNascimento");
		clienteDAO.inserirCliente(new Cliente(nome, sobrenome, CPF, login, senha));
		response.sendRedirect("listar");
	}

	private void atualizarCliente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String CPF = request.getParameter("CPF");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		// String dataNascimento = request.getParameter("dataNascimento");
		clienteDAO.inserirCliente(new Cliente(nome, sobrenome, CPF, login, senha));
		response.sendRedirect("listar");
	}

	private void deletarCliente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Cliente cliente = clienteDAO.recuperarPorId(id);
		clienteDAO.deletarCliente(cliente);
		response.sendRedirect("listar"); // aqui a pagina inicial ou de produtos
	}
	
	private void listarFuncionarios(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Funcionario> funcionarios = funcionarioDAO.recuperarFuncionarios();
		request.setAttribute("funcionarios", funcionarios);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-funcionarios.jsp");// pagina de listar produto
																							// virá aqui
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-funcionario.jsp"); // formulario do produto
																								// virá
																								// aqui
		dispatcher.forward(request, response);
	}

	// INCOMPLETO
	private void mostrarFormularioEditarFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Funcionario funcionario = funcionarioDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-funcionario.jsp");
		request.setAttribute("funcionario", funcionario);
		dispatcher.forward(request, response);
	}

	private void inserirFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cargo = request.getParameter("cargo");
		String funcao = request.getParameter("funcao");
		String CPF = request.getParameter("CPF");
		String dataNascimento = request.getParameter("dataNascimeto");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		funcionarioDAO.inserirFuncionario(new Funcionario(login, senha, nome, sobrenome, cargo, funcao, CPF));
		response.sendRedirect("listar");
	}

	private void atualizarFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cargo = request.getParameter("cargo");
		String funcao = request.getParameter("funcao");
		String CPF = request.getParameter("CPF");
		String dataNascimento = request.getParameter("dataNascimeto");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		funcionarioDAO.atualizarFuncionario(new Funcionario(login, senha, nome, sobrenome, cargo, funcao, CPF));
		response.sendRedirect("listar");	}

	private void deletarFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Funcionario funcionario = funcionarioDAO.recuperarPorId(id);
		funcionarioDAO.deletarFuncionario(funcionario);
		response.sendRedirect("listar"); // aqui a pagina inicial ou de produtos
	}

}
