package model.dao;

import java.util.List;

import model.entities.users.Cliente;

public interface ClienteDAO {

	void inserirCliente(Cliente cliente);

	void deletarCliente(Cliente cliente);

	void atualizarCliente(Cliente cliente);

	List<Cliente> recuperarClientes();

//	List<Cliente> recuperarClientesOrdemDecrescente();
}
