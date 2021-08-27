package model.entities.products;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import model.entities.users.Fornecedor;

@Entity
@Table(name = "item")
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	// criar variavel para identificar o item

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_item")
	private Long id;

	@Column(name = "quantidade", nullable = false, unique = false)
	private float quantidade; // em kg, por isso float.

	
	@Column(name = "valorTotal", nullable = false, unique = false)
	private float valorTotal; // Esse atributo nos permite acessar o valor total de um item, que é calculado a
								// partir do preço de um produto * quantidade

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_item")
	private Produto produto;
	
	
	@ManyToOne
	@JoinColumn(name = "pedido")
//	@ForeignKey(name = "pedido")
	private Pedido pedido;
		

	public Item() {
	}

	public Item(Produto produto, Fornecedor fornecedor, float quantidade) {
		setProduto(produto);
		setQuantidade(quantidade);
		setValorTotal(calculaValorTotal());
	}

	public String getNomeProduto() { // alterar ao fazer alteção no atributo produto
		return produto.getNome();
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
