package model.dao;

import java.time.LocalDate;
import java.util.List;

import model.entities.users.Cliente;
import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

public interface ClienteDAO {

	void inserirCliente(Cliente cliente);

	void deletarCliente(Cliente cliente);

	/*
	 * void inserirNomeCliente(String novoNome);
	 * 
	 * void inserirCpfCliente(String novoCpf);
	 * 
	 * void inserirDataNascimentoCliente(LocalDate dataDeNascimento);
	 * 
	 * void inserirLocalidadeCliente(Localidade localidade);
	 * 
	 * void inserirTelefoneCliente(String telefone);
	 * 
	 * void inserirLoginCliente(String login);
	 * 
	 * void inserirSenhaCliente(String senha);
	 * 
	 * void inserirContatoCliente(Contato contato);
	 */

	void atualizarLocalidadeCliente(Localidade localidade);

	void atualizarTelefoneCliente(String telefone);

	void atualizarLoginCliente(String login);

	void atualizarSenhaCliente(String senha);

	void atualizarContatoCliente(Contato contato);

	List<Cliente> recuperarClientesOrdemCrescente();

	List<Cliente> recuperarClientesOrdemDecrescente();
}
