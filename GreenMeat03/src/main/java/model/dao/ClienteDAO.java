package model.dao;

import java.time.LocalDate;
import java.util.List;

import model.entities.users.Cliente;
import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

public interface ClienteDAO {

	void inserirCliente(Cliente cliente);

	void deletarCliente(Cliente cliente);

	void atualizarCliente(Cliente cliente);

	List<Cliente> recuperarClientes();

//	List<Cliente> recuperarClientesOrdemDecrescente();
}
