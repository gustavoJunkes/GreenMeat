package model.entities.users.information;

import java.util.ArrayList;
import java.util.List;

import model.dao.cliente.ClienteDAO;
import model.dao.cliente.ClienteDAOImpl;
import model.dao.item.ItemDAO;
import model.dao.item.ItemDAOImpl;
import model.dao.pedido.PedidoDAOImpl;
import model.dao.pedido.PedidoDAO;
import model.dao.produto.ProdutoDAO;
import model.dao.produto.ProdutoDAOImpl;
import model.entities.products.Item;
import model.entities.products.Pedido;
import model.entities.products.Produto;
import model.entities.products.Tipo;
import model.entities.users.Cliente;
import model.exceptions.InvalidFieldException;

public class Principal {
	public static void main(String[] args) throws InvalidFieldException {

		System.out.println("Hello World");

		//////////////////// CADASTRO CLIENTE///////////////////////////

		ClienteDAO clienteDAO = new ClienteDAOImpl();
		Cliente cliente = new Cliente();
		String nome = "Jonas";
		String sobrenome = "Abelardo";
		String login = "JoAbLog";
		String senha = "senhasecreta";
		String CPF = "121.234.377-32";

		cliente.setNome(nome);
		cliente.setCPF(CPF);
		cliente.setLogin(login);
		cliente.setSenha(senha);
		cliente.setSobrenome(sobrenome);
//		cliente.setId((long) 1);

		clienteDAO.inserirCliente(cliente);

		List<Cliente> clientes = clienteDAO.recuperarClientes();

		for (int i = 0; i < clientes.size(); i++) {
			System.out.println("Cliente: " + clientes.get(i).getNome());
			System.out.println("ID:" + clientes.get(i).getId());
			System.out.println(" ");

		}
		
		
		

//		clienteDAO.atualizarCliente(cliente);

		//////////////////// CADASTRO FORNECEDOR///////////////////////////

		/*
		 * FornecedorDAO fornecedorDAO = new FornecedorDAOImpl(); Fornecedor fornecedor
		 * = new Fornecedor();
		 * 
		 * String nomeFantasia = "Tog Carniefero"; String razaoSocial =
		 * "Mas di cinquentia anius siervino tu familia"; String cnpj =
		 * "176.767.456.354";
		 * 
		 * fornecedor.setNomeFantasia(nomeFantasia);
		 * fornecedor.setRazaoSocial(razaoSocial); fornecedor.setCNPJ(cnpj);
		 * 
		 * fornecedorDAO.inserirFornecedor(fornecedor);
		 * 
		 * ////////////////////CADASTRO FUNCIONARIO///////////////////////////
		 * 
		 * FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();
		 * 
		 * Funcionario funcionario = new Funcionario("MeuLogin04",
		 * "MinhaSenhaSecretaMesmo", "Júlia", "Menegildo", "123.134.521-98",
		 * "Estagiario", "Adicionar Produtos");
		 * 
		 * funcionarioDAO.inserirFuncionario(funcionario);
		 * 
		 */
		//////////////////// CADASTRO PRODUTO///////////////////////////
				  
		  ProdutoDAO produtoDAO = new ProdutoDAOImpl(); Produto produto1 = new
		  Produto("Picanha", "Este produto é muito gostoso, compre ele", Tipo.BOVINO,
		  22, 30);
		  
		  Produto produto2 = new Produto("Frango", "Carne saudável e de qualidade",
		  Tipo.AVE, 13, 21);
		  
		  produtoDAO.inserirProduto(produto1); produtoDAO.inserirProduto(produto2);
		  
		  ItemDAO itemDAO = new ItemDAOImpl(); Item item1 = new Item(produto2, 10);
		  Item item2 = new Item(produto1, 5);
		  
		  itemDAO.inserirItem(item1); itemDAO.inserirItem(item2);
		  
		  PedidoDAO pedidoDAO = new PedidoDAOImpl(); List<Item>itens = new
		  ArrayList<Item>(); itens.add(item1); itens.add(item2);
		  
		 Pedido pedido = new Pedido(cliente, itens);
		 
		 pedidoDAO.inserirPedido(pedido);
		
//		clienteDAO.recuperarClientes();

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
