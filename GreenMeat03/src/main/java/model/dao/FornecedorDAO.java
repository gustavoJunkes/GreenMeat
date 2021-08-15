package model.dao;

import java.util.List;

import model.entities.products.Produto;
import model.entities.users.Fornecedor;

public interface FornecedorDAO {

	void inserirForencedor(Fornecedor fornecedor);
	
	void deletarForencedor(Fornecedor fornecedor);
	
	void atualizarProdutos(Fornecedor fornecedor, List<Produto>novosProdutos);
	
	List<Fornecedor> recuperarFornecedores();
	
}
