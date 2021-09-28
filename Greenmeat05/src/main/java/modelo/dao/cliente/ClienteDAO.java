package modelo.dao.cliente;

import java.util.List;

import modelo.entitidade.usuario.Cliente;

public interface ClienteDAO {

	void inserirCliente(Cliente cliente);

	void deletarCliente(Cliente cliente);

	void atualizarCliente(Cliente cliente);

	Cliente recuperarPorId(Long id);
	
	Cliente recuperarCliente(Cliente cliente);
	
	List<Cliente> recuperarClientes();

}
