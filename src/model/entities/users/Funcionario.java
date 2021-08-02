package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.exceptions.InvalidFieldException;

public class Funcionario extends Usuario {

	private String nome; // Atributo repetido, aparece tambem na classe cliente
	private String funcao;
	private String CPF; // Atributo repetido, aparece tambem na classe cliente
	private LocalDate dataNascimento; // Atributo repetido, aparece tambem na classe cliente
	private Contato contato; // Atributo repetido, aparece também na SuperClasse Usuario

//	Falta validar cpf

//	Ao criar funcionario criar tambem seu login e senha

	public Funcionario(String nome, String funcao, String CPF, LocalDate dataNascimento, Localidade localidade,
			String login, String senha, Contato contato) throws InvalidFieldException {
		super(localidade, login, senha, contato);
		setNome(nome);
		setFuncao(funcao);
		setCPF(CPF);
		setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws InvalidFieldException {
		if (nome.isBlank() || nome.isEmpty())
			throw new InvalidFieldException("Campo nulo");
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

	public void setCPF(String CPF) { // Adicionar validação de cpf aqui
		this.CPF = CPF;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento2) throws InvalidFieldException {
		if (dataNascimento2.isAfter(LocalDate.now()))
			throw new InvalidFieldException("Data inválida");
		this.dataNascimento = dataNascimento2;
	}

	public Contato getContato() { // este método está sobre escrevendo o mesmo metodo na superClasse Usuario
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}