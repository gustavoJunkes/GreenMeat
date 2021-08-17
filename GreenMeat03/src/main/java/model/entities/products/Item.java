package model.entities.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import model.entities.users.Fornecedor;

@Entity
@Table(name = "item")
public class Item implements serializable {

	private static final long serialVersionUID = 1L;

	// criar variavel para identificar o item

	@Id
	@Column(name = "id_item")
	private Long id;

	@Column(name = "produto")
	private Produto produto;

	@Column(name = "quantidade")
	private float quantidade; // em kg, por isso float.

	@Column(name = "fornecedor")
	private Fornecedor fornecedor;

	@Column(name = "valorTotal")
	private float valorTotal; // Esse atributo nos permite acessar o valor total de um item, que é calculado a
								// partir do preço de um produto * quantidade

	@oneToMany(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_item")
	private Produto produto;

	public Item() {
	}

	public Item(Produto produto, Fornecedor fornecedor, float quantidade) {
		setProduto(produto);
		setFornecedor(fornecedor);
		setQuantidade(quantidade);
		setValorTotal(calculaValorTotal());
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

	public float calculaValorTotal() {
		return this.produto.getPrecoVenda();
	}
}
