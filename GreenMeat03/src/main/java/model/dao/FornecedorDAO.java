package model.dao;

import java.util.List;

import model.entities.users.Fornecedor;

public interface FornecedorDAO {

	void inserirFornecedor(Fornecedor fornecedor);
	
	void deletarFornecedor(Fornecedor fornecedor);

	void atualizarFornecedor(Fornecedor fornecedor);
	
	List<Fornecedor>recuperarFornecedores();
	
}