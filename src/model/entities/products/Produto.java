package model.entities.products;

import java.time.LocalDate;

import model.exceptions.InvalidFieldException;

public class Produto {

	private String nome;
	private String descricao;
	private float precoCusto;
	private float precoVenda;
	private LocalDate dataValidade;
	private Tipo tipoCarne;
	private float preco; // preco é um atributo repetido

//	Falta adicionar atributos precoCusto e PrecoVenda no construtor
	public Produto(String nome, String descricao, Tipo tipoCarne, float preco)  throws InvalidFieldException{
		setNome(nome);
		setDescricao(descricao);
		setTipoCarne(tipoCarne);
		setPreco(preco);
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

	public void setDataValidade(LocalDate dataValidade) throws InvalidFieldException{
//		Aqui ele verifica se a data de validade inserida é antes da data atual, evitando que se cadastre um produto vencido
		if(dataValidade.isBefore(LocalDate.now()))
			throw new InvalidFieldException("Data inválida");
		
		this.dataValidade = dataValidade;
	}

	public Tipo getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(Tipo tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}
