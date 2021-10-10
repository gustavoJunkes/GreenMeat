package modelo.entitidade.usuario;

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
import javax.persistence.criteria.JoinType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import modelo.dao.produto.ProdutoDAO;
import modelo.entidade.produto.Produto;
import modelo.entitidade.usuario.informacao.Contato;
import modelo.entitidade.usuario.informacao.Localidade;

@Entity
@Table(name = "fornecedor")
public class Fornecedor extends PessoaJuridica {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_fornecedor")
	private Long id;

	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "fornecedor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Produto> produtos = new ArrayList<Produto>(); // Quais Produtos ele fornece

	public Fornecedor(String razaoSocial, String nomeFantasia, Localidade endereco, String login, String senha,
			Contato contato, String CNPJ) {
		super(login, senha, contato, CNPJ, razaoSocial, nomeFantasia);
		setNivelAcesso();
	}

	public String getNivelAcesso() {
		nivelAcesso = "fornecedor";
		return nivelAcesso;
	}
	
	public void setNivelAcesso() {
		nivelAcesso = "fornecedor";
	}
//	public Fornecedor(String razaoSocial, String nomeFantasia, Localidade endereco, String login, String senha,
//			Contato contato, String CNPJ, List<Produto> produtos) {
//		super(login, senha, contato, CNPJ, razaoSocial, nomeFantasia);
//		setProdutos(produtos);
//	}


	public Fornecedor(Long id) {
		setId(id);
	}
	
	public Fornecedor() {
		setNivelAcesso();
		// TODO Auto-generated constructor stub
	}

	public Fornecedor(String razaoSocial, String nomeFantasia, String login, String senha, String CNPJ) {
		super(login, senha, CNPJ, razaoSocial, nomeFantasia);
		setNivelAcesso();
	}

//	public Fornecedor(String razaoSocial, String nomeFantasia, String login, String senha, String CNPJ,
//			List<Produto> produtos) {
//		super(login, senha, CNPJ, razaoSocial, nomeFantasia);
//		setProdutos(produtos);
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

//	M�todo que adiciona um produto ao fornecedor, e adiciona este fornecedor ao
// 	produto

	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
		produto.setFornecedor(this);
	}
	
	public void removerProduto(Produto produto) {
		this.produtos.remove(produto);
		produto.setFornecedor(null);
	}

}
