package model.entities.products;

import java.util.List;

import model.entities.users.Fornecedor;

public class Estoque {

	
	private List <Item> itens;
//	este método retorna apenas um endereço de memória
	
	public List <Item> getItens() {
		return itens;
	}

	public void setItens(List <Item> itens) {
		this.itens = itens;
	}
	
	// para aumentar a quantidade de um item em estoque deve-se acessar diretamente esse item, por exemplo item1.setQuantidade(quantidade);
	
	public void adicionarAoEstoque(Item item) {
		itens.add(item);
	}
	
	
}
