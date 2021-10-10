package modelo.entidade.produto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import modelo.entitidade.usuario.Fornecedor;

@Entity
@Table(name = "estoque")
public class Estoque implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;

	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Item> itens = new ArrayList();

	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	private Fornecedor fornecedor;
	
//	public void adicionarProdutoAoEstoque(Produto produto) {
//		
//		EstoqueDAO estoqueDAO = new EstoqueDAOImpl();
//		
//		Estoque estoque = estoqueDAO.recuperarEstoque();
//		if (getItens().contains(produto) == false) {
//			getItens().add(new Item(produto, 0));
//		}
//	}

	public void adicionarAoEstoque(Item item) {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

//	falta mencionar estoque na classe item
//	@OneToMany(fetch = FetchType.LAZY,mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Estoque> itens = new ArrayList<Estoque>();

//	
//	public List<Estoque> getItens() {
//		return itens;
//	}

//	falta relaciona
//	public void setItens(List<Estoque> itens) {
//		this.itens = itens;
//	}

	// para aumentar a quantidade de um item em estoque deve-se acessar diretamente
	// esse item, por exemplo item1.setQuantidade(quantidade);

//	public void adicionarAoEstoque(Estoque item) {
//		itens.add(item);
//	}

}
