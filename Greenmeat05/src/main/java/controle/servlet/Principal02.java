package controle.servlet;

import java.util.List;
import java.util.Scanner;

import model.exception.users.information.EmailInvalidException;
import model.exception.users.information.PhoneNumberInvalidException;
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
import modelo.dao.produto.ProdutoDAO;
import modelo.dao.produto.ProdutoDAOImpl;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOImpl;
import modelo.entitidades.usuarios.Usuario;
import modelo.entitidades.usuarios.informacao.Contato;

public class Principal02 {

	public static void main(String[] args) throws PhoneNumberInvalidException, EmailInvalidException {

		boolean resp = true;

		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();
		ItemDAO itemDAO = new ItemDAOImpl();
		ProdutoDAO produtoDAO = new ProdutoDAOImpl();
		LocalidadeDAO localidadeDAO = new LocalidadeDAOImpl();
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		ClienteDAO clienteDAO = new ClienteDAOImpl();
//		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		ContatoDAO contatoDAO = new ContatoDAOImpl();
		FornecedorDAO fornecedorDAO = new FornecedorDAOImpl();
//		Cliente cliente1 = new Cliente();
		Scanner leitor = new Scanner(System.in);

		Usuario user = new Usuario();
		user.setLogin("gu");
		
		Usuario cliente1 = usuarioDAO.recuperarUsuario(user);


//		System.out.println("Novo login:");
//		String login = leitor.next();
//
//		System.out.println("Nova senha:");
//		String senha = leitor.next();
//
//		cliente1.setLogin(login);
//		cliente1.setSenha(senha);

//		usuarioDAO.inserirUsuario(cliente1);

		System.out.println("---------------");
		System.out.println("CONTATO");

		while (resp == true) {
			Contato contato1 = new Contato();

			System.out.println("");
			System.out.println("Novo telefone:");
			String telefone = leitor.next();

			System.out.println("Novo email:");
			String email = leitor.next();

			contato1.setEmail(email);
			contato1.setTelefone(telefone);


			contatoDAO.inserirContato(contato1);

			cliente1.adicionarContato(contato1);

//			cliente1.setNome(nome);
//			cliente1.setSobrenome(sobrenome);
//			cliente1.setCPF(CPF);
//			cliente1.setLogin(login);
//			cliente1.setSenha(senha);
//			cliente1.setDataCadastro(LocalDate.now());

			contatoDAO.atualizarContato(contato1);
			
//			 
//			 List<Contato>contatos1 = contatoDAO.recuperarContatosUsuario(cliente1);
//			 contatos1.add(contato1);
//			cliente1.setContatos(contatos1);
		}
		
	}
}
