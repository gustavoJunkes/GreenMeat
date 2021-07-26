package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

public class Funcionario extends Usuario {

	private String nome;
	private String funcao;
	private String CPF;
	private LocalDate dataNascimento;
	private Contato contato;

	
//	Ao criar funcionario criar tambem seu login e senha
	
	public Funcionario(String nome, String funcao, String CPF, LocalDate dataNascimento, Localidade localidade, String login,
			String senha, Contato contato) {
		super(localidade, login, senha, contato);
		setNome(nome);
		setFuncao(funcao);
		setCPF(CPF);
		setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento2) {
		this.dataNascimento = dataNascimento2;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}