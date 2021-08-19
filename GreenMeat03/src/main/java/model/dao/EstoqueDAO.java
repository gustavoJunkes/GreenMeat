package model.dao;

import java.util.List;

import model.entities.products.Estoque;
import model.entities.products.Item;

public interface EstoqueDAO {

	void inserirEstoque(Estoque estoque);
	
	void deletarEstoque(Estoque estoque);
	
	void atualizarEstoque(Estoque estoque);
	
	List<Estoque>recuperarEstoque();
}
