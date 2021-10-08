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

import modelo.dao.cliente.ClienteDAO;
import modelo.dao.cliente.ClienteDAOImpl;
import modelo.dao.contato.ContatoDAO;
import modelo.dao.contato.ContatoDAOImpl;
import modelo.dao.endereco.EnderecoDAO;
import modelo.dao.endereco.EnderecoDAOImpl;
import modelo.dao.fornecedor.FornecedorDAO;
import modelo.dao.fornecedor.FornecedorDAOImpl;
import modelo.dao.funcionario.FuncionarioDAO;
import modelo.dao.funcionario.FuncionarioDAOImpl;
import modelo.dao.item.ItemDAO;
import modelo.dao.item.ItemDAOImpl;
import modelo.dao.localidade.LocalidadeDAO;
import modelo.dao.localidade.LocalidadeDAOImpl;
import modelo.dao.pedido.PedidoDAO;
import modelo.dao.pedido.PedidoDAOImpl;
import modelo.dao.produto.ProdutoDAO;
import modelo.dao.produto.ProdutoDAOImpl;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOImpl;
import modelo.entidade.produto.Item;
import modelo.entidade.produto.Pedido;
import modelo.entidade.produto.Produto;
import modelo.entitidade.usuario.Cliente;
import modelo.entitidade.usuario.Fornecedor;
import modelo.entitidade.usuario.Funcionario;
import modelo.entitidade.usuario.PessoaFisica;
import modelo.entitidade.usuario.Usuario;
import modelo.entitidade.usuario.informacao.Contato;
import modelo.entitidade.usuario.informacao.Endereco;
import modelo.entitidade.usuario.informacao.Localidade;
import modelo.excecao.InvalidFieldException;
import modelo.excecao.user.information.CountryInvalidException;
import modelo.excecao.user.information.EmailInvalidException;
import modelo.excecao.user.information.PhoneNumberInvalidException;

@WebServlet("/")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ItemDAO itemDAO;
	private PedidoDAO pedidoDAO;
	private ProdutoDAO produtoDAO;
	private ClienteDAO clienteDAO;
	private FuncionarioDAO funcionarioDAO;
	private FornecedorDAO fornecedorDAO;
	private ContatoDAO contatoDAO;
	private UsuarioDAO usuarioDAO;
	private LocalidadeDAO localidadeDAO;
	private EnderecoDAO enderecoDAO;

	public void init() {

		itemDAO = new ItemDAOImpl();
		pedidoDAO = new PedidoDAOImpl();
		produtoDAO = new ProdutoDAOImpl();
		clienteDAO = new ClienteDAOImpl();
		funcionarioDAO = new FuncionarioDAOImpl();
		fornecedorDAO = new FornecedorDAOImpl();
		contatoDAO = new ContatoDAOImpl();
		usuarioDAO = new UsuarioDAOImpl();
		localidadeDAO = new LocalidadeDAOImpl();
		enderecoDAO = new EnderecoDAOImpl();
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

		try {

			switch (action) {

			case "/inicio":
				mostrarTelaInicio(request, response, sessao);
				break;

			case "/login":
				mostrarTelaLogin(request, response, sessao);
				break;

			case "/logar":
				logar(request, response, sessao);
				break;

			case "/deslogar":
				deslogar(request, response);
				break;

			case "/perfil-cliente":
//				mostrarPerfilCliente(request, response);
				break;

//			========>Pedido<========

			case "/novo-pedido":
//				abrirNovoPedido(request, response);
				break;

			case "/adicionar-produto-pedido":
				adicionarProdutoPedido(request, response, sessao);
				break;

			case "/listar-itens-pedido":
				listarItensPedido(request, response, sessao);
				break;
//			========>Produto<========

			case "/novo-produto":
				mostrarFormularioNovoProduto(request, response, sessao);
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

			case "/listar-produtos":
				listarProdutos(request, response);
				break;

//				========>Cliente<========

			case "/novo-cliente":
				mostrarFormularioNovoCliente(request, response, sessao);
				break;

			case "/inserir-cliente":
				inserirCliente(request, response, sessao);
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

			case "/listar-clientes":
				listarClientes(request, response);
				break;

//				========>Funcionario<========

			case "/novo-funcionario":
				mostrarFormularioNovoFuncionario(request, response);
				break;

			case "/inserir-funcionario":
				inserirFuncionario(request, response, sessao);
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

			case "/listar-funcionarios":
				listarFuncionarios(request, response);
				break;

//				========>Fornecedor<========

			case "/novo-fornecedor":
				mostrarFormularioNovoFornecedor(request, response, sessao);
				break;

			case "/inserir-fornecedor":
				inserirFornecedor(request, response, sessao);
				break;

			case "/deletar-fornecedor":
				deletarFornecedor(request, response);
				break;

			case "/editar-fornecedor":
				mostrarFormularioEditarFornecedor(request, response);
				break;

			case "/atualizar-fornecedor":
				atualizarFornecedor(request, response);
				break;

			case "/listar-fornecedores":
				listarFornecedores(request, response);
				break;
//				========>Contato<========

			case "/novo-contato":
				mostrarFormularioNovoContato(request, response);
				break;

			case "/inserir-contato":
				inserirContato(request, response);
				break;

			case "/deletar-contato":
				deletarContato(request, response);
				break;

			case "/editar-contato":
				mostrarFormularioEditarContato(request, response);
				break;

			case "/atualizar-contato":
				atualizarContato(request, response);
				break;

			case "/listar-contatos":
				listarContatos(request, response, sessao);
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
		} catch (EmailInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PhoneNumberInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CountryInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	=============>Geral<==================

//	private void mostrarPerfilCliente(HttpServletRequest request, HttpServletResponse response, HttpSession sessao )

	private void mostrarTelaInicio(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws ServletException, IOException {

		Usuario usuario = (Usuario)sessao.getAttribute("usuario");
		request.setAttribute("usuario", usuario);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);

	}

	private void mostrarTelaLogin(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws ServletException, IOException {

		if (sessao.getAttribute("usuario") != null) {
			response.sendRedirect(request.getRequestURI());
		}else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
		}

	}

	private void logar(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		Usuario user = new Usuario();
		user.setLogin(login);
		Usuario usuario = usuarioDAO.recuperarUsuario(user); // Recupera um obj ou pf ou pj

		if (usuario instanceof Cliente && senha.equals(usuario.getSenha())) {
			System.out.println("Nome 1: " + ((PessoaFisica) usuario).getNome());
			System.out.println("É um cliente!");
			sessao.setAttribute("usuario", usuario);
		} else if (usuario instanceof Funcionario && senha.equals(usuario.getSenha())) {
			System.out.println("É um Funcionario!");
			sessao.setAttribute("usuario", usuario);
		} else if (usuario instanceof Fornecedor && senha.equals(usuario.getSenha())) {
			System.out.println("É um fornecedor!");
			sessao.setAttribute("usuario", usuario);
		} else
			System.out.println("Senha incorreta :(");

		if ((Usuario) sessao.getAttribute("usuario") == null)
			response.sendRedirect("login");
		else {
			System.out.println(sessao.getAttribute("usuario"));
			response.sendRedirect("inicio");
		}
//		Cliente cliente1 = new Cliente();
//		cliente1.setLogin(login);
//		Cliente cliente = clienteDAO.recuperarCliente(cliente1);
//		if (cliente != null && cliente.getSenha() == senha && cliente.getLogin() == login )
//			sessao.setAttribute("usuario", cliente);
//		else {
//			Funcionario funcionario1 = new Funcionario();
//			funcionario1.setLogin(login);
//			Funcionario funcionario = funcionarioDAO.recuperarFuncionarioPorLogin(login);
//			if(funcionario != null && funcionario.getSenha() == senha && funcionario.getLogin() == login )
//				sessao.setAttribute("usuario", funcionario);
//			else {
//				Fornecedor fornecedor1 = new Fornecedor();
//				Fornecedor fornecedor = fornecedorDAO.recuperarFornecedorPorLogin(fornecedor1);
//				if(fornecedor != null && fornecedor.getSenha() == senha && fornecedor.getLogin() == login)
//					sessao.setAttribute("usuario", fornecedor);

//					response.sendError(404, "Nenhum usuário com login " + login + " foi encontrado em nossa base de dados tente se cadastrar");
//			}
//		}

	}

	private void deslogar(HttpServletRequest request, HttpServletResponse response) {

		request.getSession().invalidate();

	}

//	========>Pedido<========

	private void adicionarProdutoPedido(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws IOException {

		Long id = Long.parseLong(request.getParameter("idProduto"));
		Float quantidade = (float) 10;
//				Float.parseFloat(request.getParameter("quantidade"));

		Produto produto = produtoDAO.recuperarPorId(id);
		Cliente cliente = (Cliente) sessao.getAttribute("usuario");

		Pedido pedido = (Pedido) sessao.getAttribute("pedido");

		if (pedido == null) {
			pedido = new Pedido();
			pedidoDAO.inserirPedido(pedido);
		}
		Item item = new Item(produto, quantidade);
		item.setPedido(pedido);
		itemDAO.inserirItem(item);
//		pedidoDAO.inserirPedido(pedido);
//				pedidoDAO.recuperarPedidosCliente(cliente);

//		List<Item> itens = new ArrayList<Item>();
//		itens = itemDAO.recuperarItensPedido(pedido);
//		itens.add(item);

		pedido.getItens().add(item);
//		pedido.setItens(itens);
		pedidoDAO.atualizarPedido(pedido);

		List<Pedido> pedidos = pedidoDAO.recuperarPedidosCliente(cliente);
		pedidos.add(pedido);

		cliente.setPedidos(pedidos);
		clienteDAO.atualizarCliente(cliente);

		sessao.setAttribute("pedido", pedido);
		response.sendRedirect(request.getContextPath() + "/listar-produtos");
	}

	private void listarItensPedido(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws SQLException, IOException, ServletException, InvalidFieldException {

		Pedido pedido = (Pedido) sessao.getAttribute("pedido");
		List<Item> itens = itemDAO.recuperarItensPedido(pedido);
		request.setAttribute("itens", itens);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-itens-pedido-teste.jsp");
		dispatcher.forward(request, response);
	}

//	=============>Produto<================

	private void listarProdutos(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException, InvalidFieldException {
		List<Produto> produtos = produtoDAO.recuperarProdutos();
		request.setAttribute("produtos", produtos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-produtos-teste.jsp");// pagina de listar
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoProduto(HttpServletRequest request, HttpServletResponse response,
			HttpSession sessao) throws ServletException, IOException {

		Usuario usuario = (Usuario) sessao.getAttribute("usuario");
		if ((Usuario) sessao.getAttribute("usuario") == null || usuario instanceof Funcionario == false) {
			System.out.println("Acesso negado a esta página.");
			response.sendRedirect("inicio");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-produto.jsp"); // formulario do
			dispatcher.forward(request, response);
		}
//		if(usuario == null)
//			System.out.println("Chegou null");
//		else if(usuario != null)
//			System.out.println("Chegou certinho!");
	}

	// INCOMPLETO
	private void mostrarFormularioEditarProduto(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Produto produto = produtoDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-contato.jsp");
		request.setAttribute("produto", produto);
		dispatcher.forward(request, response);
	}

	private void inserirProduto(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		Float precoCusto = Float.parseFloat(request.getParameter("precoCusto"));
		Float precoVenda = Float.parseFloat(request.getParameter("precoVenda"));
		String tipoCarne = request.getParameter("tipoCarne");

		Fornecedor fornecedor = fornecedorDAO.recuperarPorId(Long.parseLong(request.getParameter("idFornecedor")));

		Produto produto = new Produto(nome, descricao, tipoCarne, precoCusto, precoVenda, fornecedor);
		produtoDAO.inserirProduto(produto);

		List<Produto> produtos = new ArrayList<Produto>();
		produtoDAO.recuperarProdutosFornecedor(fornecedor);
		produtos.add(produto);

		fornecedor.setProdutos(produtos);
		fornecedorDAO.atualizarFornecedor(fornecedor);

//		List<Fornecedor>fornecedores = new ArrayList<Fornecedor>();
//		fornecedores = fornecedorDAO.recuperarFornecedores();

		response.sendRedirect("novo-produto");
//		response.sendError(401, "O fornecedor mencionado não foi encontrado em nossa base de dados, cadastre o fornecedor ou escolha um cadastrado");
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

	private void listarClientes(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException, InvalidFieldException {
		List<Cliente> clientes = clienteDAO.recuperarClientes();
		request.setAttribute("clientes", clientes);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-clientes-teste.jsp");// pagina de listar
		dispatcher.forward(request, response);
	}
	
	
	private void mostrarFormularioNovoCliente(HttpServletRequest request, HttpServletResponse response,
			HttpSession sessao) throws ServletException, IOException {

		if (sessao.getAttribute("usuario") != null) {
			response.sendRedirect("inicio");
		}else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-cliente.jsp");
		dispatcher.forward(request, response);
		}
	}

// INCOMPLETO
	private void mostrarFormularioEditarCliente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Cliente cliente = clienteDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-cliente.jsp");
		request.setAttribute("cliente", cliente);
		dispatcher.forward(request, response);
	}

	private void inserirCliente(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws SQLException, IOException, InvalidFieldException, ServletException, EmailInvalidException,
			PhoneNumberInvalidException, CountryInvalidException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String CPF = request.getParameter("CPF");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
//		String dataNascimento = request.getParameter("dataNascimento");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String pais = request.getParameter("pais");
		String estado = request.getParameter("estado");
		String provincia = request.getParameter("provincia");
		String continente = request.getParameter("continente");
		String nomeDaRua = request.getParameter("nomeDaRua");
		String logradouro = request.getParameter("logradouro");
		String tipoDaVia = request.getParameter("tipoDaVia");
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		String CEP = request.getParameter("CEP");
		String complemento = request.getParameter("complemento");

		Cliente cliente = new Cliente(login, senha, nome, sobrenome, CPF);
		clienteDAO.inserirCliente(cliente);

		Contato contato = new Contato(email, telefone, cliente);
		contatoDAO.inserirContato(contato);

		clienteDAO.atualizarCliente(cliente);

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(cliente);
		Localidade localidade = new Localidade(usuarios, pais, estado, provincia, continente);
		localidadeDAO.inserirLocalidade(localidade);

		List<Localidade> localidades = localidadeDAO.recuperarLocalidadesUsuario(cliente);
		localidades.add(localidade);
		cliente.setLocalidades(localidades);

		Endereco endereco = new Endereco(nomeDaRua, logradouro, tipoDaVia, numero, CEP, complemento, localidade);
		enderecoDAO.inserirEndereco(endereco);

		List<Endereco> enderecos = new ArrayList<Endereco>();
		// Está incompleto, dessa forma exclui todos os outros endereços
		enderecos.add(endereco);
		localidade.setEnderecos(enderecos);
		localidadeDAO.atualizarLocalidade(localidade);
		clienteDAO.atualizarCliente(cliente);

		sessao.setAttribute("usuario", cliente);
		response.sendRedirect("inicio");

//		request.setAttribute("usuario", cliente);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-contato.jsp");
//		dispatcher.forward(request, response);
		////
//		request.getSession().setAttribute("usuario", cliente);
		////
//		request.setAttribute("usuario", cliente);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-contato.jsp");

//		response.sendRedirect("novo-contato");
//		dispatcher.forward(request, response);
//		System.out.println(((Usuario) request.getAttribute("usuario")).getId());

		////

		////

//		response.sendRedirect(request.getContextPath() + "/novo-contato/" + cliente.getId());
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

//	===================
	private void listarFuncionarios(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Funcionario> funcionarios = funcionarioDAO.recuperarFuncionarios();
		request.setAttribute("funcionarios", funcionarios);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-funcionarios.jsp");// pagina de listar
																								// produto
																								// virá aqui
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-funcionario.jsp"); 
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

	private void inserirFuncionario(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws SQLException, IOException, InvalidFieldException, EmailInvalidException, PhoneNumberInvalidException, CountryInvalidException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cargo = request.getParameter("cargo");
		String funcao = request.getParameter("funcao");
		String CPF = request.getParameter("CPF");
//		String dataNascimento = request.getParameter("dataNascimeto");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		String dataNascimento = request.getParameter("dataNascimento");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String pais = request.getParameter("pais");
		String estado = request.getParameter("estado");
		String provincia = request.getParameter("provincia");
		String continente = request.getParameter("continente");
		String nomeDaRua = request.getParameter("nomeDaRua");
		String logradouro = request.getParameter("logradouro");
		String tipoDaVia = request.getParameter("tipoDaVia");
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		String CEP = request.getParameter("CEP");
		String complemento = request.getParameter("complemento");

		Funcionario funcionario = new Funcionario(login, senha, nome, sobrenome, CPF, cargo, funcao);
		funcionarioDAO.inserirFuncionario(funcionario);

		Contato contato = new Contato(email, telefone, funcionario);
		contatoDAO.inserirContato(contato);

		funcionarioDAO.inserirFuncionario(funcionario);

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(funcionario);
		Localidade localidade = new Localidade(usuarios, pais, estado, provincia, continente);
		localidadeDAO.inserirLocalidade(localidade);

		List<Localidade> localidades = localidadeDAO.recuperarLocalidadesUsuario(funcionario);
		localidades.add(localidade);
		funcionario.setLocalidades(localidades);

		Endereco endereco = new Endereco(nomeDaRua, logradouro, tipoDaVia, numero, CEP, complemento, localidade);
		enderecoDAO.inserirEndereco(endereco);

		List<Endereco> enderecos = new ArrayList<Endereco>();
		// Está incompleto, dessa forma exclui todos os outros endereços
		enderecos.add(endereco);
		localidade.setEnderecos(enderecos);
		localidadeDAO.atualizarLocalidade(localidade);
		funcionarioDAO.atualizarFuncionario(funcionario);

		sessao.setAttribute("usuario", funcionario);
		response.sendRedirect("inicio");
	}

	private void atualizarFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cargo = request.getParameter("cargo");
		String funcao = request.getParameter("funcao");
		String CPF = request.getParameter("CPF");
//		String dataNascimento = request.getParameter("dataNascimeto");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		funcionarioDAO.atualizarFuncionario(new Funcionario(login, senha, nome, sobrenome, cargo, funcao, CPF));
		response.sendRedirect("listar");
	}

	private void deletarFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Funcionario funcionario = funcionarioDAO.recuperarPorId(id);
		funcionarioDAO.deletarFuncionario(funcionario);
		response.sendRedirect("listar"); // aqui a pagina inicial ou de produtos
	}

//	/////////////////////

	private void listarFornecedores(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Fornecedor> fornecedores = fornecedorDAO.recuperarFornecedores();
		request.setAttribute("fornecedores", fornecedores);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-fornecedores.jsp");// pagina de listar
																								// produto
																								// virá aqui
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoFornecedor(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws ServletException, IOException {

		if(sessao.getAttribute("usuario") != null  && !(sessao.getAttribute("usuario") instanceof Funcionario) ) {
			response.sendRedirect("inicio");
		}else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-fornecedor.jsp"); // formulario do produto
		dispatcher.forward(request, response);
		}
	}

	// INCOMPLETO
	private void mostrarFormularioEditarFornecedor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Fornecedor fornecedor = fornecedorDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-fornecedor.jsp");
		request.setAttribute("fornecedor", fornecedor);
		dispatcher.forward(request, response);
	}

	private void inserirFornecedor(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws SQLException, IOException, InvalidFieldException, EmailInvalidException, PhoneNumberInvalidException,
			CountryInvalidException {

		String nomeFantasia = request.getParameter("nomeFantasia");
		String razaoSocial = request.getParameter("razaoSocial");
		String CNPJ = request.getParameter("CNPJ");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String pais = request.getParameter("pais");
		String estado = request.getParameter("estado");
		String provincia = request.getParameter("provincia");
		String continente = request.getParameter("continente");
		String nomeDaRua = request.getParameter("nomeDaRua");
		String logradouro = request.getParameter("logradouro");
		String tipoDaVia = request.getParameter("tipoDaVia");
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		String CEP = request.getParameter("CEP");
		String complemento = request.getParameter("complemento");

		Fornecedor fornecedor = new Fornecedor(nomeFantasia, razaoSocial, CNPJ, login, senha);
		fornecedorDAO.inserirFornecedor(fornecedor);

		Contato contato = new Contato(email, telefone, fornecedor);
		contatoDAO.inserirContato(contato);

		fornecedorDAO.atualizarFornecedor(fornecedor);

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(fornecedor);
		Localidade localidade = new Localidade(usuarios, pais, estado, provincia, continente);
		localidadeDAO.inserirLocalidade(localidade);

		List<Localidade> localidades = localidadeDAO.recuperarLocalidadesUsuario(fornecedor);
		localidades.add(localidade);
		fornecedor.setLocalidades(localidades);

		Endereco endereco = new Endereco(nomeDaRua, logradouro, tipoDaVia, numero, CEP, complemento, localidade);
		enderecoDAO.inserirEndereco(endereco);

		List<Endereco> enderecos = new ArrayList<Endereco>();
		// Está incompleto, dessa forma exclui todos os outros endereços
		enderecos.add(endereco);
		localidade.setEnderecos(enderecos);
		localidadeDAO.atualizarLocalidade(localidade);

		fornecedorDAO.atualizarFornecedor(fornecedor);
		sessao.setAttribute("usuario", fornecedor);
		response.sendRedirect("inicio");
	}

	private void atualizarFornecedor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nomeFantasia = request.getParameter("nomeFantasia");
		String razaoSocial = request.getParameter("razaoSocial");
		String CNPJ = request.getParameter("CNPJ");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		fornecedorDAO.atualizarFornecedor(new Fornecedor(nomeFantasia, razaoSocial, CNPJ, login, senha));
		response.sendRedirect("listar");
	}

	private void deletarFornecedor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Fornecedor fornecedor = fornecedorDAO.recuperarPorId(id);
		fornecedorDAO.deletarFornecedor(fornecedor);
		response.sendRedirect("listar"); // aqui a pagina inicial ou de produtos
	}

	/////////////////////////////

	private void listarContatos(HttpServletRequest request, HttpServletResponse response, HttpSession sessao)
			throws SQLException, IOException, ServletException {

		List<Contato> contatos = contatoDAO.recuperarContatos();
		request.setAttribute("contatos", contatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-contatos.jsp");// pagina de listar produto
																							// virá aqui
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-contato.jsp"); // formulario do produto
																								// virá
																								// aqui
		dispatcher.forward(request, response);
	}

	// INCOMPLETO
	private void mostrarFormularioEditarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = contatoDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-contato.jsp");
		request.setAttribute("contato", contato);
		dispatcher.forward(request, response);
	}

	private void inserirContato(HttpServletRequest request, HttpServletResponse response) throws SQLException,
			IOException, InvalidFieldException, EmailInvalidException, PhoneNumberInvalidException {

		// Neste método é criado um objeto usuario a partir do login digitado pelo
		// usuario,
		// e este usuario recebe um novo contato, assim como o contato cadastrado recebe
		// o usuario

		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
//		String login = request.getParameter("login");
		Long id = Long.parseLong(request.getParameter("id"));

		Usuario usuario = usuarioDAO.recuperarPorId(id);

//		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

//		Cliente cliente1 = new Cliente();
//		cliente1.setId(id);
//
//		Cliente cliente = clienteDAO.recuperarCliente(cliente1);

//		Usuario usuario2 = (Usuario) request.
		Contato contato = new Contato(email, telefone, usuario);
//		contato.setUsuario(usuario);
		contatoDAO.inserirContato(contato);

		List<Contato> contatos = contatoDAO.recuperarContatosUsuario(usuario);
		contatos.add(contato);

		// erro de transiencia aqui?
		usuario.setContatos(contatos);
		usuarioDAO.atualizarUsuario(usuario);
		contatoDAO.atualizarContato(contato);
		response.sendRedirect("nova-localidade"); // encaminhar para atualizar usuario?
	}

	private void atualizarContato(HttpServletRequest request, HttpServletResponse response) throws SQLException,
			IOException, InvalidFieldException, EmailInvalidException, PhoneNumberInvalidException {

		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		contatoDAO.atualizarContato(new Contato(email, telefone));
		response.sendRedirect("");
	}

	private void deletarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = contatoDAO.recuperarPorId(id);
		contatoDAO.deletarContato(contato);
		response.sendRedirect(""); // aqui a pagina inicial ou de produtos
	}

//	=========>Localidade<=========

//	private void listarLocalidades(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//
//		List<Localidade> localidades = localidadeDAO.recuperarLocalidades();
//		request.setAttribute("localidades", localidades);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-enderecos.jsp");// pagina de listar produto
//																							// virá aqui
//		dispatcher.forward(request, response);
//	}
//
//	private void mostrarFormularioNovaLocalidade(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-localidade.jsp"); // formulario do produto
//		// virá
//		// aqui
//		dispatcher.forward(request, response);
//	}
//
//	// INCOMPLETO
//	private void mostrarFormularioEditarLocalidade(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, ServletException, IOException {
//
//		long id = Long.parseLong(request.getParameter("id"));
////		Localidade localidade = localidadeDAO.recuperarPorId(id);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-localidade.jsp");
////		request.setAttribute("contato", contato);
//		dispatcher.forward(request, response);
//	}
//
//	private void inserirLocalidade(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, InvalidFieldException, CountryInvalidException {
//
//		String pais = request.getParameter("pais");
//		String estado = request.getParameter("estado");
//		String provincia = request.getParameter("provincia");
//		String continente = request.getParameter("continente");
//
//		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
//		
//		List<Usuario> usuarios = new ArrayList();
//		usuarios.add(usuario);
//		Localidade localidade = new Localidade(usuarios, pais, estado, provincia, continente);
//		localidadeDAO.inserirLocalidade(localidade);
//
//		List<Localidade> localidades = localidadeDAO.recuperarLocalidadesUsuario(usuario);
//		localidades.add(localidade);
//		usuario.setLocalidades(localidades);
//		
//		request.getSession().removeAttribute("usuario");
//
//		// precisa ser dessa forma, em conjunto com o método que verifica
//		// se a localidade já existe em banco antes de cadastrar
////		List<Usuario>usuarios = usuarioDAO.recuperarUsuariosLocalidade()
//
//		List<Usuario> usuarios = new ArrayList();
//		usuarios.add(usuario);
//		Localidade localidade = new Localidade(usuarios, pais, estado, provincia, continente);
//		localidadeDAO.inserirLocalidade(localidade);
//
//		List<Localidade> localidades = localidadeDAO.recuperarLocalidadesUsuario(usuario);
//		localidades.add(localidade);
//		usuario.setLocalidades(localidades);
//		request.getSession().setAttribute("localidade", localidade);
//
//		response.sendRedirect("novo-endereco");
//	}
//
//	private void atualizarLocalidade(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, InvalidFieldException, CountryInvalidException {
//
//		String pais = request.getParameter("pais");
//		String estado = request.getParameter("estado");
//		String provincia = request.getParameter("provincia");
//		String continente = request.getParameter("continente");
//		localidadeDAO.atualizarLocalidade(new Localidade(pais, estado, provincia, continente));
//	}
//
//	private void deletarLocalidade(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException {
//
//		long id = Long.parseLong(request.getParameter("id"));
//		// não foi criado pois este cadastro precisa ser repensado
////		Localidade localidade = localidadeDAO.recuperarPorId(id);
////		localidadeDAO.deletarLocalidade(localidade);
//		response.sendRedirect("mostrar-tela-inicial"); // aqui a pagina inicial ou de produtos
//	}

//	=========>Endereço<=========

//	private void listarEnderecos(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//
//		List<Endereco> enderecos = enderecoDAO.recuperarEnderecos();
//		request.setAttribute("enderecos", enderecos);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-enderecos.jsp");// pagina de listar produto
//																							// virá aqui
//		dispatcher.forward(request, response);
//	}
//
//	private void mostrarFormularioNovoEndereco(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-endereco.jsp"); // formulario do produto
//																								// virá
//																								// aqui
//		dispatcher.forward(request, response);
//	}
//
//	// INCOMPLETO
//	private void mostrarFormularioEditarEndereco(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, ServletException, IOException {
//
//		long id = Long.parseLong(request.getParameter("id"));
////		Endereco endereco = enderecoDAO.recuperarPorId(id);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("form-contato.jsp");
////		request.setAttribute("endereco", endereco);
//		dispatcher.forward(request, response);
//	}
//
//	private void inserirEndereco(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, InvalidFieldException {
//
//		String nomeDaRua = request.getParameter("nomeDaRua");
//		String logradouro = request.getParameter("logradouro");
//		String tipoDaVia = request.getParameter("tipoDaVia");
//		Integer numero = Integer.parseInt(request.getParameter("numero"));
//		String CEP = request.getParameter("CEP");
//		String complemento = request.getParameter("complemento");
//
//		
//		Endereco endereco = new Endereco(nomeDaRua, logradouro, tipoDaVia, numero, CEP, complemento, localidade);
//		enderecoDAO.inserirEndereco(endereco);
//
//		List<Endereco> enderecos = new ArrayList<Endereco>();
//		// Está incompleto, dessa forma exclui todos os outros endereços
//		enderecos.add(endereco);
//		localidade.setEnderecos(enderecos);
//		localidadeDAO.atualizarLocalidade(localidade);
//		
//		
//		
//		Localidade localidade = (Localidade) request.getSession().getAttribute("localidade");
//
//		Endereco endereco = new Endereco(nomeDaRua, logradouro, tipoDaVia, numero, CEP, complemento, localidade);
//		enderecoDAO.inserirEndereco(endereco);
//
//		List<Endereco> enderecos = new ArrayList<Endereco>();
//		// Está incompleto, dessa forma exclui todos os outros endereços
//		enderecos.add(endereco);
//		localidade.setEnderecos(enderecos);
//		localidadeDAO.atualizarLocalidade(localidade);
//		response.sendRedirect("inicio");
//	}
//
//	private void atualizarEndereco(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, InvalidFieldException {
//
//		String nomeDaRua = request.getParameter("nomeDaRua");
//		String logradouro = request.getParameter("logradouro");
//		String tipoDaVia = request.getParameter("tipoDaVia");
//		Integer numero = Integer.parseInt(request.getParameter("numero"));
//		String CEP = request.getParameter("CEP");
//		String complemento = request.getParameter("complemento");
//
//		Endereco endereco = new Endereco(nomeDaRua, logradouro, tipoDaVia, numero, CEP, complemento);
//		enderecoDAO.atualizarEndereco(endereco);
//		response.sendRedirect("inicio");
//	}
//
//	private void deletarEndereco(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException {
//
//		long id = Long.parseLong(request.getParameter("id"));
////		Endereco endereco = enderecoDAO.recuperarPorId(id);
////		enderecoDAO.deletarEndereco(endereco);
//		response.sendRedirect("inicio"); // aqui a pagina inicial ou de produtos
//	}

}
