package model.dao.fornecedor;

import java.util.List;

import model.entities.products.Produto;
import model.entities.users.Fornecedor;

public interface FornecedorDAO {

	void inserirFornecedor(Fornecedor fornecedor);
	
	void deletarFornecedor(Fornecedor fornecedor);

	void atualizarFornecedor(Fornecedor fornecedor);
	
	Fornecedor recuperarPorId(Long id);
	
	Fornecedor recuperarFornecedorProduto(Produto produto);
	
	List<Fornecedor>recuperarFornecedores();
	
}