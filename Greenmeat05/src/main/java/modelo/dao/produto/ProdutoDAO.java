package modelo.dao.produto;

//import java.time.LocalDate;
import java.util.List;

import modelo.entidade.produto.Item;
import modelo.entidade.produto.Produto;

public interface ProdutoDAO {

	void inserirProduto(Produto produto);

	void deletarProduto(Produto produto);

	void atualizarProduto(Produto produto);

	Produto recuperarPorId(Long id);
	
	Produto recuperarProduto(Produto produto);

	Produto recuperarProdutoItem(Item item);

	List<Produto> recuperarPorCategoria(Produto produto);

	List<Produto> recuperarProdutos();

}
