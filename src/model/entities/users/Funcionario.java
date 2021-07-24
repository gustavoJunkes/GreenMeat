package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;

public class Funcionario {

	private String nome;
	private String funcao;
	private String CPF;
	private LocalDate dataNascimento;
	private Contato contato;

	public Funcionario(String nome, String funcao, String carteiraDeTrabalho, LocalDate dataNascimento) {

		setNome(nome);
		setFuncao(funcao);
		setCPF(carteiraDeTrabalho);
		setDataNascimento(dataNascimento);
	}

	public void mostrar() {

		System.out.println("Nome do funcionario: " + getNome());
		System.out.println("Função do funcionario: " + getFuncao());
		System.out.println("CPF do funcionario: " + getCPF());
		System.out.println("Data de nascimento do funcionario: " + getDataNascimento());
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