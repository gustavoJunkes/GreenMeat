package model.dao;

import java.util.List;

import model.entities.products.Item;
import model.entities.products.Produto;

public interface ItemDAO {
	void soma(Item item); // Diz respeito ao valor total do item

	void inserirItem(Produto produto, float quantidade);
	
	void pegarProduto(Item item, Produto produto);

	void pegarPreco(Item item);

	void alterarQuantidade(Item item, float novaQuantidade);

	List<Item> mostrarItem();
}
