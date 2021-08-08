package model.entities.products;

import model.entities.users.Fornecedor;

public class Item {

	// criar variavel para identificar o item

	private Produto produto;
	private float quantidade; // em kg, por isso float.
	private Fornecedor fornecedor;
	private float valorTotal; // Esse atributo nos permite acessar o valor total de um item, que é calculado a
								// partir do preço de um produto * quantidade

	public Item(Produto produto, Fornecedor fornecedor, float quantidade) {
		setProduto(produto);
		setFornecedor(fornecedor);
		setQuantidade(quantidade);
		setValorTotal(produto.getPreco() * getQuantidade());
	}

	public String getNomeProduto() { // alterar ao fazer alteção no atributo produto
		return produto.getNome();
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

////////////////////////////
	public float getQuantidade() {
		return quantidade;
	}

/////////////////////////////
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public String getFornecedor() {
		return fornecedor.getRazaoSocial();
	}

	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

}
