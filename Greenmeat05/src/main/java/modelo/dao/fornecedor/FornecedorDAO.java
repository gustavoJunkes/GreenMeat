package modelo.dao.fornecedor;

import java.util.List;

import modelo.entidade.produto.Estoque;
import modelo.entidade.produto.Produto;
import modelo.entitidade.usuario.Fornecedor;

public interface FornecedorDAO {

	void inserirFornecedor(Fornecedor fornecedor);
	
	void deletarFornecedor(Fornecedor fornecedor);

	void atualizarFornecedor(Fornecedor fornecedor);
	
	Fornecedor recuperarPorId(Long id);
	
	Fornecedor recuperarFornecedorPorLogin(Fornecedor fornecedor);
	
	Fornecedor recuperarFornecedorProduto(Produto produto);
	
	Fornecedor recuperarFornecedorEstoque(Estoque estoque);
	
	List<Fornecedor>recuperarFornecedores();
	
}