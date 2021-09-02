package model.dao.item;

import java.util.List;

import model.entities.products.Item;
import model.entities.products.Pedido;

public interface ItemDAO {
//	void soma(Item item); // Diz respeito ao valor total do item

	void inserirItem(Item item);

	void deletarItem(Item item);

	void atualizarItem(Item item);

	List<Item> recuperarItensPedido(Pedido pedido);

	List<Item> recuperarItens();
}
