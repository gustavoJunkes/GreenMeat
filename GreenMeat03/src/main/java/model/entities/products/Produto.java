package model.entities.products;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import model.exception.products.ExpirationDateInvalidException;
import model.exceptions.InvalidFieldException;

@Entity
@Table(name = "produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name = "nome",length = 25, nullable=false,unique=false)               
	private String nome;
	
	@Column(name = "descricao",length = 45, nullable=false,unique=false)
	private String descricao;
	
	@Column(name="precoCusto", length = 25, nullable=false,unique=false)
	private float precoCusto;
	
	@Column(name = "precoVenda",length = 25, nullable=false,unique=false)
	private float precoVenda;
	
	@Column(name = "dataValidade" ,length = 25, nullable=false,unique=false)
	private LocalDate dataValidade;
	
	@Column(name = "tipoCarne",length = 25, nullable=false,unique=false)
	private Tipo tipoCarne;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_item")
	private Produto produto;

	public Produto() {}


//	Falta adicionar atributos precoCusto e PrecoVenda no construtor
	public Produto(String nome, String descricao, Tipo tipoCarne)  throws InvalidFieldException, ExpirationDateInvalidException{
		setNome(nome);
		setDescricao(descricao);
		setTipoCarne(tipoCarne);
	}

//	Tratamento de exceções básico nos métodos de acesso, apenas uma exceção criada, a InvalidFieldException
//	Exceção genérica para campos invalidos
//	Essa exceção está tratando simplesmente de verificar se os campos estão vazios
//	Precisa de mais verificações
	
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
		if (precoVenda == 0)
			throw new InvalidFieldException("Campo nulo ou menor que 1");

		this.precoVenda = precoVenda;
	}

	public LocalDate getDataValidade(){
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) throws ExpirationDateInvalidException{
//		Aqui ele verifica se a data de validade inserida é antes da data atual, evitando que se cadastre um produto vencido
		if(dataValidade.isBefore(LocalDate.now()))
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
