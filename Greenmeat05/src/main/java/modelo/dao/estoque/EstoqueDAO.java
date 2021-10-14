package modelo.dao.estoque;

import java.util.List;

import modelo.entidade.produto.Estoque;
import modelo.entitidade.usuario.Fornecedor;

public interface EstoqueDAO {

	void inserirEstoque(Estoque estoque);
	
	void deletarEstoque(Estoque estoque);
	
	void atualizarEstoque(Estoque estoque);
	
	List<Estoque>recuperarEstoques();
	
	Estoque recuperarEstoqueFornecedor(Fornecedor fornecedor);
}
