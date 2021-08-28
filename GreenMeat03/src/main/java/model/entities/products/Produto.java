package model.entities.products;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import model.exception.products.ExpirationDateInvalidException;
import model.exceptions.InvalidFieldException;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Long id;

	@Column(name = "nome", length = 50, nullable = false, unique = false)
	private String nome;

	@Column(name = "descricao", length = 100, nullable = false, unique = false)
	private String descricao;

	@Column(name = "precoCusto", nullable = false, unique = false)
	private float precoCusto;

	@Column(name = "precoVenda", nullable = false, unique = false)
	private float precoVenda;

	@Column(name = "dataValidade")
	private LocalDate dataValidade;

	@Enumerated(EnumType.STRING)
	private Tipo tipoCarne;

	public Produto() {
	}

	public Produto(String nome, String descricao, Tipo tipoCarne, float precoCusto, float precoVenda)
			throws InvalidFieldException {
		setNome(nome);
		setDescricao(descricao);
		setTipoCarne(tipoCarne);
		setPrecoCusto(precoCusto);
		setPrecoVenda(precoVenda);
	}

	public Produto(String nome, String descricao, Tipo tipoCarne)
			throws InvalidFieldException, ExpirationDateInvalidException {
		setNome(nome);
		setDescricao(descricao);
		setTipoCarne(tipoCarne);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws InvalidFieldException {
		if (nome.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) throws InvalidFieldException {

		if (descricao.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.descricao = descricao;
	}

	public float getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(float precoCusto) throws InvalidFieldException {
		if (precoCusto == 0)
			throw new InvalidFieldException("Campo nulo ou menor que 1");

		this.precoCusto = precoCusto;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) throws InvalidFieldException {
		if (precoVenda <= 0)
			throw new InvalidFieldException("Valor inválido");

		this.precoVenda = precoVenda;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) throws ExpirationDateInvalidException {
		if (dataValidade.isBefore(LocalDate.now()))
			throw new ExpirationDateInvalidException("Data inválida");

		this.dataValidade = dataValidade;
	}

	public Tipo getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(Tipo tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

}
