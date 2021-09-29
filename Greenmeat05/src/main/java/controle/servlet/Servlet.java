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
import modelo.dao.localidade.LocalidadeDAO;
import modelo.dao.localidade.LocalidadeDAOImpl;
import modelo.dao.produto.ProdutoDAO;
import modelo.dao.produto.ProdutoDAOImpl;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOImpl;
import modelo.entidade.produto.Produto;
import modelo.entitidade.usuario.Cliente;
import modelo.entitidade.usuario.Fornecedor;
import modelo.entitidade.usuario.Funcionario;
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
	private ProdutoDAO produtoDAO;
	private ClienteDAO clienteDAO;
	private FuncionarioDAO funcionarioDAO;
	private FornecedorDAO fornecedorDAO;
	private ContatoDAO contatoDAO;
	private UsuarioDAO usuarioDAO;
	private LocalidadeDAO localidadeDAO;
	private EnderecoDAO enderecoDAO;

	public void init() {

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

		String action = request.getServletPath();

		System.out.println(action);

		try {

			switch (action) {

			
			case "/inicio":
//				mostrarTelaInicio(request,response);
			break;
			
			case "/login":
//				mostrarTelaLogin(request,response);
				break;
//			========>Produto<========
			
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

			case "/listar-produtos":
				listarProdutos(request, response);
				break;

//				========>Cliente<========

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

//			case "/listar-clientes":
//				listarClientes(request, response);
//				break;

//				========>Funcionario<========

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

			case "/listar-funcionarios":
				listarFuncionarios(request, response);
				break;

//				========>Fornecedor<========

			case "/novo-fornecedor":
				mostrarFormularioNovoFornecedor(request, response);
				break;

			case "/inserir-fornecedor":
				inserirFornecedor(request, response);
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

//				========>Localidade<========

			case "/nova-localidade":
				mostrarFormularioNovaLocalidade(request, response);
				break;

			case "/inserir-localidade":
				inserirLocalidade(request, response);
				break;

			case "/deletar-localidade":
				deletarLocalidade(request, response);
				break;

			case "/editar-localidade":
				mostrarFormularioEditarLocalidade(request, response);
				break;

			case "/atualizar-localidade":
				atualizarLocalidade(request, response);
				break;

			case "/listar-localidades":
				listarLocalidades(request, response);
				break;

//				========>Endereço<========

			case "/novo-endereco":
				mostrarFormularioNovoEndereco(request, response);
				break;

			case "/inserir-endereco":
				inserirEndereco(request, response);
				break;

			case "/deletar-endereco":
				deletarEndereco(request, response);
				break;

			case "/editar-endereco":
				mostrarFormularioEditarEndereco(request, response);
				break;

			case "/atualizar-endereco":
				atualizarEndereco(request, response);
				break;

			case "/listar-endereco":
				listarEnderecos(request, response);
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

	private void listarProdutos(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException, InvalidFieldException {

		
		Produto produto = new Produto();
		produto.setNome("caarne");
		produto.setPrecoCusto(16);
		
		request.setAttribute("nomeProduto", produto.getNome());
		
		
		
		List<Produto> produtos1 = produtoDAO.recuperarProdutos();
		request.setAttribute("produtos", produtos1);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-produtos.jsp");// pagina de listar produto
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
		
		Fornecedor fornecedor = fornecedorDAO.recuperarPorId(Long.parseLong(request.getParameter("idFornecedor")));
		
		Produto produto = new Produto(nome, descricao, tipoCarne, precoCusto, precoVenda, fornecedor);
		produtoDAO.inserirProduto(produto);
		
		List<Produto>produtos = new ArrayList<Produto>(); 
		produtoDAO.recuperarProdutosFornecedor(fornecedor);
		produtos.add(produto);
		
		fornecedor.setProdutos(produtos);
		fornecedorDAO.atualizarFornecedor(fornecedor);
				
//		List<Fornecedor>fornecedores = new ArrayList<Fornecedor>();
//		fornecedores = fornecedorDAO.recuperarFornecedores();
			
		response.sendRedirect("inicio");	
//		response.sendError(401, "O fornecedor mencionado não foi encontrado em nossa base de dados, cadastre o fornecedor ou escolha um cadastrado");
	}

	private void atualizarProduto(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		float precoCusto = Float.parseFloat(request.getParameter("precoCusto"));
		float precoVenda = Float.parseFloat(request.getParameter("precoVenda"));
		String tipoCarne = request.getParameter("tipoCarne");
//		produtoDAO.atualizarProduto(new Produto(nome, descricao, tipoCarne, precoCusto, precoVenda));
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
		dispatcher.forward(request, response);
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
			throws SQLException, IOException, InvalidFieldException, ServletException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String CPF = request.getParameter("CPF");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		// String dataNascimento = request.getParameter("dataNascimento");
		Cliente cliente = new Cliente(login, senha, nome, sobrenome, CPF);
		clienteDAO.inserirCliente(cliente);
		
		request.getSession().setAttribute("usuario", cliente);
		
//		request.setAttribute("usuario", cliente);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-contato.jsp");

//		response.sendRedirect("novo-contato");
//		dispatcher.forward(request, response);
//		System.out.println(((Usuario) request.getAttribute("usuario")).getId());
		response.sendRedirect("novo-contato");
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-funcionario.jsp"); // formulario do
																									// produto
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

	private void mostrarFormularioNovoFornecedor(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-fornecedor.jsp"); // formulario do produto
																								// virá
																								// aqui
		dispatcher.forward(request, response);
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

	private void inserirFornecedor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nomeFantasia = request.getParameter("nomeFantasia");
		String razaoSocial = request.getParameter("razaoSocial");
		String CNPJ = request.getParameter("CNPJ");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		Fornecedor fornecedor = new Fornecedor(nomeFantasia, razaoSocial, CNPJ, login, senha);
		fornecedorDAO.inserirFornecedor(fornecedor);
		request.getSession().setAttribute("usuario", fornecedor);
		response.sendRedirect("novo-contato");
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

	private void listarContatos(HttpServletRequest request, HttpServletResponse response)
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
		String login = request.getParameter("login");
//		Long id = Long.parseLong(request.getParameter("id"));

		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		
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

	private void listarLocalidades(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Localidade> localidades = localidadeDAO.recuperarLocalidades();
		request.setAttribute("localidades", localidades);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-enderecos.jsp");// pagina de listar produto
																							// virá aqui
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovaLocalidade(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-localidade.jsp"); // formulario do produto
		// virá
		// aqui
		dispatcher.forward(request, response);
	}

	// INCOMPLETO
	private void mostrarFormularioEditarLocalidade(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
//		Localidade localidade = localidadeDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-localidade.jsp");
//		request.setAttribute("contato", contato);
		dispatcher.forward(request, response);
	}

	private void inserirLocalidade(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException, CountryInvalidException {

		String pais = request.getParameter("pais");
		String estado = request.getParameter("estado");
		String provincia = request.getParameter("provincia");
		String continente = request.getParameter("continente");

		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		request.getSession().removeAttribute("usuario");
		
		// precisa ser dessa forma, em conjunto com o método que verifica
		// se a localidade já existe em banco antes de cadastrar
//		List<Usuario>usuarios = usuarioDAO.recuperarUsuariosLocalidade()
	
		List<Usuario> usuarios = new ArrayList();
		usuarios.add(usuario);
		Localidade localidade = new Localidade(usuarios, pais, estado, provincia, continente);
		localidadeDAO.inserirLocalidade(localidade);

		List<Localidade>localidades = localidadeDAO.recuperarLocalidadesUsuario(usuario);
		localidades.add(localidade);
		usuario.setLocalidades(localidades);
		request.getSession().setAttribute("localidade", localidade);
	
		response.sendRedirect("novo-endereco");
	}

	private void atualizarLocalidade(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException, CountryInvalidException {

		String pais = request.getParameter("pais");
		String estado = request.getParameter("estado");
		String provincia = request.getParameter("provincia");
		String continente = request.getParameter("continente");
		localidadeDAO.atualizarLocalidade(new Localidade(pais, estado, provincia, continente));
	}

	private void deletarLocalidade(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		// não foi criado pois este cadastro precisa ser repensado
//		Localidade localidade = localidadeDAO.recuperarPorId(id);
//		localidadeDAO.deletarLocalidade(localidade);
		response.sendRedirect("mostrar-tela-inicial"); // aqui a pagina inicial ou de produtos
	}

//	=========>Endereço<=========

	private void listarEnderecos(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Endereco> enderecos = enderecoDAO.recuperarEnderecos();
		request.setAttribute("enderecos", enderecos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-enderecos.jsp");// pagina de listar produto
																							// virá aqui
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoEndereco(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-endereco.jsp"); // formulario do produto
																								// virá
																								// aqui
		dispatcher.forward(request, response);
	}

	// INCOMPLETO
	private void mostrarFormularioEditarEndereco(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
//		Endereco endereco = enderecoDAO.recuperarPorId(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-contato.jsp");
//		request.setAttribute("endereco", endereco);
		dispatcher.forward(request, response);
	}

	private void inserirEndereco(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nomeDaRua = request.getParameter("nomeDaRua");
		String logradouro = request.getParameter("logradouro");
		String tipoDaVia = request.getParameter("tipoDaVia");
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		String CEP = request.getParameter("CEP");
		String complemento = request.getParameter("complemento");

		Localidade localidade = (Localidade) request.getSession().getAttribute("localidade");
		
		Endereco endereco = new Endereco(nomeDaRua, logradouro, tipoDaVia, numero, CEP, complemento, localidade);
		enderecoDAO.inserirEndereco(endereco);
		
		List<Endereco>enderecos = new ArrayList<Endereco>();
		//Está incompleto, dessa forma exclui todos os outros endereços		
		enderecos.add(endereco);
		localidade.setEnderecos(enderecos);
		localidadeDAO.atualizarLocalidade(localidade);
		response.sendRedirect("inicio");
	}

	private void atualizarEndereco(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, InvalidFieldException {

		String nomeDaRua = request.getParameter("nomeDaRua");
		String logradouro = request.getParameter("logradouro");
		String tipoDaVia = request.getParameter("tipoDaVia");
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		String CEP = request.getParameter("CEP");
		String complemento = request.getParameter("complemento");

		Endereco endereco = new Endereco(nomeDaRua, logradouro, tipoDaVia, numero, CEP, complemento);
		enderecoDAO.atualizarEndereco(endereco);
		response.sendRedirect("inicio");
	}

	private void deletarEndereco(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
//		Endereco endereco = enderecoDAO.recuperarPorId(id);
//		enderecoDAO.deletarEndereco(endereco);
		response.sendRedirect("inicio"); // aqui a pagina inicial ou de produtos
	}

}
