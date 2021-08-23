package model.entities.products;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "estoque")
public class Estoque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Estoque> itens = new ArrayList<Estoque>();

//	este método retorna apenas um endereço de memória
	public List<Estoque> getItens() {
		return itens;
	}

	public void setItens(List<Estoque> itens) {
		this.itens = itens;
	}

	// para aumentar a quantidade de um item em estoque deve-se acessar diretamente
	// esse item, por exemplo item1.setQuantidade(quantidade);

	public void adicionarAoEstoque(Estoque item) {
		itens.add(item);
	}

}
