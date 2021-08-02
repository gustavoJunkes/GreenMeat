package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.exceptions.InvalidFieldException;

public class Cliente extends Usuario {

	
//	criar uma função para validar cpf
	
	private String nome;
	private String cpf; // Falta validar cpf // cpf é um atributo repetido na classe Funcionario e Cliente
	private LocalDate dataDeNascimento;

	public Cliente(String nome, String cpf, LocalDate dataDeNascimento, Localidade localidade, String telefone,
			String login, String senha, Contato contato) throws InvalidFieldException {
		super(localidade, login, senha, contato);

		setNome(nome);
		setCpf(cpf);
		setDataDeNascimento(dataDeNascimento);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws InvalidFieldException {
		if (nome.isBlank() || nome.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) { // validar cpf aqui
		this.cpf = cpf;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
