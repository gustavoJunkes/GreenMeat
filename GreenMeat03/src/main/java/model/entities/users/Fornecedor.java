package model.entities.users;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import model.entities.products.Produto;
import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

@Entity
@Table(name = "fornecedor")
public class Fornecedor extends Usuario {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fornecedor")
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "produto", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Produto> Produtos = new ArrayList<Produto>(); // Quais Produtos ele fornece

	public Fornecedor(String razaoSocial, String nomeFantasia, Localidade endereco, String login, String senha,
			Contato contato, String CNPJ) {
		super(login, senha);
	}

	public List<Produto> getProdutos() {
		return Produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		Produtos = produtos;
	}

}
