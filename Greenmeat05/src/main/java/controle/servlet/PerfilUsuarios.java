package controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.cliente.ClienteDAOImpl;
import modelo.dao.contato.ContatoDAOImpl;
import modelo.dao.endereco.EnderecoDAOImpl;
import modelo.dao.estoque.EstoqueDAOImpl;
import modelo.dao.fob.fobDAO;
import modelo.dao.fob.fobDAOImpl;
import modelo.dao.fornecedor.FornecedorDAOImpl;
import modelo.dao.funcionario.FuncionarioDAOImpl;
import modelo.dao.item.ItemDAOImpl;
import modelo.dao.localidade.LocalidadeDAOImpl;
import modelo.dao.pedido.PedidoDAOImpl;
import modelo.dao.produto.ProdutoDAOImpl;
import modelo.dao.usuario.UsuarioDAOImpl;
import modelo.entidade.calculo.CalculoFob;
import modelo.entidade.produto.Pedido;
import modelo.entitidade.usuario.Cliente;
import modelo.excecao.InvalidFieldException;
import modelo.excecao.user.information.CountryInvalidException;
import modelo.excecao.user.information.PhoneNumberInvalidException;

@WebServlet("/fob")
public class PerfilUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private fobDAO fobDAO;

	public void init() {

		fobDAO = new fobDAOImpl();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sessao = request.getSession();

		String action = request.getServletPath();

		System.out.println(action);

		switch (action) {

		case "/Calcular-Fob":
			calcularFob(request, response, sessao);
			break;
			
		}
	}

	private void calcularFob(HttpServletRequest request, HttpServletResponse response, HttpSession sessao) {
		// TODO Auto-generated method stub
		
	}
}