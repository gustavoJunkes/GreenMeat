package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

public class PessoaFisica extends Usuario {

	private Long id;
	private String nome;
	private String sobrenome;
	private String CPF;
	private LocalDate dataDeNascimento;

	public PessoaFisica() {
		usuario();
	}
	
	public PessoaFisica(Localidade endereco, String login, String senha, Contato contato, String nome, String sobrenome,
			String CPF, LocalDate dataDeNascimento) {
		super(endereco, login, senha, contato);
		setNome(nome);
		setSobrenome(sobrenome);
		setCPF(CPF);
		setDataDeNascimento(dataDeNascimento);
		// TODO Auto-generated constructor stub
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
