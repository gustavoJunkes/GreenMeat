package modelo.dao.item;

import java.util.List;

import modelo.entidade.produto.Estoque;
import modelo.entidade.produto.Item;
import modelo.entidade.produto.Pedido;

public interface ItemDAO {
//	void soma(Item item); // Diz respeito ao valor total do item

	void inserirItem(Item item);

	void deletarItem(Item item);

	void atualizarItem(Item item);

	List<Item> recuperarItensPedido(Pedido pedido);

	List<Item> recuperarItens();
	
	List<Item> recuperarItensEstoque(Estoque estoque);
}
