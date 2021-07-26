package model.entities.products;

import java.util.List;

public class Estoque {

	
	private List <Item> itens;
//	este método retorna apenas um endereço de memória
	
	public List <Item> getItens() {
		return itens;
	}

	public void setItens(List <Item> itens) {
		this.itens = itens;
	}
	
	
	
	
}
