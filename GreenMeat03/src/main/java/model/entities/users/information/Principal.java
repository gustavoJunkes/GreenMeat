package model.entities.users.information;

import model.dao.produto.ProdutoDAO;
import model.dao.cliente.ClienteDAO;
import model.dao.cliente.ClienteDAOImpl;
import model.dao.fornecedor.FornecedorDAO;
import model.dao.fornecedor.FornecedorDAOImpl;
import model.dao.funcionario.FuncionarioDAO;
import model.dao.funcionario.FuncionarioDAOImpl;
import model.dao.produto.ProdutoDAOImpl;
import model.entities.products.Produto;
import model.entities.products.Tipo;
import model.entities.users.Cliente;
import model.entities.users.Fornecedor;
import model.entities.users.Funcionario;
import model.exceptions.InvalidFieldException;

public class Principal {
	public static void main(String[] args) throws InvalidFieldException {

		System.out.println("Hello World");
		
		
		////////////////////CADASTRO CLIENTE///////////////////////////
		
		ClienteDAO clienteDAO = new ClienteDAOImpl();
		Cliente cliente = new Cliente();
		String nome = "Louro";
		String sobrenome = "Jose";
		String login = "LJoseLog";
		String senha = "senhasecreta";
		String CPF = "179.554.871-91";
		
		cliente.setNome(nome);
		cliente.setCPF(CPF);
		cliente.setLogin(login);
		cliente.setSenha(senha);
		cliente.setSobrenome(sobrenome);
//		cliente.setId((long) 2);
		
		clienteDAO.inserirCliente(cliente);
		
//		clienteDAO.atualizarCliente(cliente);

		////////////////////CADASTRO FORNECEDOR///////////////////////////

		
		FornecedorDAO fornecedorDAO = new FornecedorDAOImpl();
		Fornecedor fornecedor = new Fornecedor();
		
		String nomeFantasia = "Tog Carniefero";
		String razaoSocial = "Mas di cinquentia anius siervino tu familia";
		String cnpj = "176.767.456.354";
					
		fornecedor.setNomeFantasia(nomeFantasia);
		fornecedor.setRazaoSocial(razaoSocial);
		fornecedor.setCNPJ(cnpj);
		
		fornecedorDAO.inserirFornecedor(fornecedor);

		////////////////////CADASTRO FUNCIONARIO///////////////////////////
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();
		
		Funcionario funcionario = new Funcionario("MeuLogin04", "MinhaSenhaSecretaMesmo", "Júlia", "Menegildo", "123.134.521-98",
				"Estagiario", "Adicionar Produtos");
		
		funcionarioDAO.inserirFuncionario(funcionario);
		

		////////////////////CADASTRO PRODUTO///////////////////////////
		
		ProdutoDAO produtoDAO = new ProdutoDAOImpl();
		Produto produto1 = new Produto("Picanha", "Este produto é muito gostoso, compre ele", Tipo.BOVINO, 22, 30);

		produtoDAO.inserirProduto(produto1);
		
		

//		Endereco endereco1 = new Endereco("Rua", "Rua Primeiro de Janeiro", "logradouro", 18, 93234123, "Casa");
//
//		Localidade localidade1 = new Localidade("Estados Unidos", "Florida", "Talahasse", "America do Norte",
//				endereco1);
//
//		
//		
//		Produto produto1 = new Produto("Picanha", "Este produto é muito gostoso, compre ele", Tipo.BOVINO, 22);
//		Produto produto2 = new Produto("Peito de Frango", "Este produto é muito gostoso, compre ele", Tipo.AVE, 16);
//		Produto produto3 = new Produto("Costeleta", "Este produto é muito gostoso, compre ele", Tipo.OVINO, 30);
//		
//		
//			
////		
//		Contato contato4 = new Contato("emailzinho4@gmail.com", "2435-4242");
////
//		System.out.println(contato4.getTelefone());
//		Fornecedor fornecedor1 = new Fornecedor("Ecomeat", "Somos uma empresa fundamentada e vendemos carne", localidade1,
//				 "MeuLogin1", "MinhaSenhaSecreta", contato4, "111.222.333.21");
////		
//		System.out.println(fornecedor1.getCNPJ());
//		System.out.println(fornecedor1.getLogin());
//		System.out.println(fornecedor1.getSenha());
//		System.out.println(fornecedor1.getNomeFantasia());

//

	}

}
