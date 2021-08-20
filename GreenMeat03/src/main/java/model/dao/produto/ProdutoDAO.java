package model.dao.produto;

//import java.time.LocalDate;
import java.util.List;
import model.entities.products.Produto;

public interface ProdutoDAO {
	
	void inserirProduto(Produto produto);

	void deletarProduto(Produto produto);

	void atualizarProduto(Produto produto);

	List<Produto> recuperarProdutos();

}
