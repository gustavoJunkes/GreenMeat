package modelo.dao.produto;

//import java.time.LocalDate;
import java.util.List;

import modelo.entidades.produtos.Item;
import modelo.entidades.produtos.Produto;
import modelo.entitidades.usuarios.Fornecedor;

public interface ProdutoDAO {

	void inserirProduto(Produto produto);

	void deletarProduto(Produto produto);

	void atualizarProduto(Produto produto);

	Produto recuperarPorId(Long id);
	
	Produto recuperarProduto(Produto produto);

	Produto recuperarProdutoItem(Item item);

	List<Produto> recuperarPorCategoria(Produto produto);
	
	List<Produto> recuperarProdutosFornecedor(Fornecedor fornecedor);

	List<Produto> recuperarProdutos();

}
