package controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.cliente.ClienteDAO;
import modelo.dao.cliente.ClienteDAOImpl;
import modelo.dao.fornecedor.FornecedorDAO;
import modelo.dao.fornecedor.FornecedorDAOImpl;
import modelo.dao.funcionario.FuncionarioDAO;
import modelo.dao.funcionario.FuncionarioDAOImpl;
import modelo.entitidade.usuario.Cliente;
import modelo.entitidade.usuario.Fornecedor;
import modelo.entitidade.usuario.Funcionario;


@WebServlet("/perfil")
public class PerfilUsuarios extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	private ClienteDAO clienteDAO;
	private FornecedorDAO fornecedorDAO;
	private FuncionarioDAO funcionarioDAO;
	
	public void init() {
		
		fornecedorDAO = new FornecedorDAOImpl();
		clienteDAO = new ClienteDAOImpl();
		funcionarioDAO = new FuncionarioDAOImpl();
		
	}


	
	
	private void mostrarTelaPerfilCliente(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws SQLException, IOException, ServletException {
		
		sessao.getAttribute("usuario");
		Cliente cliente = (Cliente) sessao.getAttribute("usuario");
		request.setAttribute("cliente", cliente);
		RequestDispatcher dispatcher = request.getRequestDispatcher("perfil-cliente.jsp");
	}
	
	private void mostrarTelaPerfilFornecedor(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws SQLException, IOException, ServletException {

		sessao.getAttribute("usuario");
		Fornecedor fornecedor = (Fornecedor) sessao.getAttribute("usuario");
		request.setAttribute("fornecedor", fornecedor);
		RequestDispatcher dispatcher = request.getRequestDispatcher("perfil-fornecedor.jsp");
	}

	private void mostrarTelaPerfilFuncionario(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws SQLException, IOException, ServletException {
	sessao.getAttribute("usuario");
	Funcionario funcionario = (Funcionario) sessao.getAttribute("usuario");
	request.setAttribute("funcionario", funcionario);
	RequestDispatcher dispatcher = request.getRequestDispatcher("perfil-funcionario.jsp");
}

	
	
}
