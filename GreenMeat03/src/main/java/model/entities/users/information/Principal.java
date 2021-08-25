package model.entities.users.information;

import model.dao.cliente.ClienteDAO;
import model.dao.cliente.ClienteDAOImpl;
import model.dao.fornecedor.FornecedorDAO;
import model.dao.fornecedor.FornecedorDAOImpl;
import model.dao.funcionario.FuncionarioDAO;
import model.dao.funcionario.FuncionarioDAOImpl;
import model.entities.users.Cliente;
import model.entities.users.Fornecedor;
import model.entities.users.Funcionario;

public class Principal {
	public static void main(String[] args) {

		System.out.println("Hello World");
		ClienteDAO clienteDAO = new ClienteDAOImpl();
		Cliente cliente = new Cliente();
		String nome = "Ricardo";
		cliente.setNome(nome);
		clienteDAO.inserirCliente(cliente);
		
		FornecedorDAO fornecedorDAO = new FornecedorDAOImpl();
		Fornecedor fornecedor = new Fornecedor();
		
		String nomeFantasia = "Bull Freal";
		String razaoSocial = "Somos uma empresa com ideais...";
		String cnpj = "453.546.456.344";
					
		fornecedor.setNomeFantasia(nomeFantasia);
		fornecedor.setRazaoSocial(razaoSocial);
		fornecedor.setCNPJ(cnpj);
		
		fornecedorDAO.inserirFornecedor(fornecedor);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();
		
		Funcionario funcionario = new Funcionario("MeuLogin03", "MinhaSenhaSecreta", "Claudio", "Alberto", "123.435.235-54",
				"Estagiario", "Adicionar Produtos");
		
		funcionarioDAO.inserirFuncionario(funcionario);
		
		
		
		

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
