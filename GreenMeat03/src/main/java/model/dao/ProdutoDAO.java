package model.dao;

//import java.time.LocalDate;
import java.util.List;
import model.entities.products.Produto;

public interface ProdutoDAO {
	
	void inserirProduto(Produto produto);

	void deletarProduto(Produto produto);

	void atualizarProduto(Produto produto);

	void atualizarDescricao(Produto produto, String novaDescricao);

	void atualizarPrecoCusto(Produto produto, float novoPrecoCusto);

	void atualizarPrecoVenda(Produto produto, float novoPrecoVenda);

//	void inserirDataValidade(Produto produto, LocalDate dataValidade);
//
//	void inserirPreco(Produto produto, float preco);
//
//	void atualizarPreco(Produto produto, float novoPreco);

//	void inserirTipoCarne(Produto produto, Tipo tipoCarne);

	List<Produto> recuperarProduto();

}
