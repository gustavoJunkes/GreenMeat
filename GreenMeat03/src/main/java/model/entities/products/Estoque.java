package model.entities.products;

import java.util.List;

import model.exception.products.QuantityInvalidException;

public class Estoque {

	private List<Item> itens;

//	este método retorna apenas um endereço de memória
	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	// para aumentar a quantidade de um item em estoque deve-se acessar diretamente
	// esse item, por exemplo item1.setQuantidade(quantidade);

	public void adicionarAoEstoque(Item item) throws QuantityInvalidException {
		if(item.getQuantidade() == 0)
			throw new QuantityInvalidException("A quantidade não é valida! ");
			
		itens.add(item);
	}

}
