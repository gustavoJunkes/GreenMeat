package models.entities.users;

import java.time.LocalDate;

import models.entities.users.information.Contato;
import models.entities.users.information.Localidade;

public class Cliente extends Usuario {

	private String nome;
	private String cpf;
	private LocalDate dataDeNascimento;

	public Cliente(String nome, String cpf, LocalDate dataDeNascimento, Localidade localidade, String telefone,
			String login, String senha, Contato contato) {
		super(localidade, login, senha, contato);

		setNome(nome);
		setCpf(cpf);
		setDataDeNascimento(dataDeNascimento);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
