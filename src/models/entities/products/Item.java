package models.entities.products;

import models.entities.users.Fornecedor;

public class Item {

	private Produto produto; 
	private float quantidade; // em kg, por isso float.
	private Fornecedor fornecedor;

	
	public Produto getProduto() { //alterar ao fazer alteção no atributo produto
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
