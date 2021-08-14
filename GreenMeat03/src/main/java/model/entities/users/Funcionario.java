package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.exceptions.InvalidFieldException;

public class Funcionario extends PessoaFisica {

	

	

	private String funcao;
	private String cargo;

//	Ao criar funcionario criar tambem seu login e senha
	
	public Funcionario(Localidade endereco, String login, String senha, Contato contato, String nome, String sobrenome,
			String CPF, LocalDate dataDeNascimento) {
		super(endereco, login, senha, contato, nome, sobrenome, CPF, dataDeNascimento);
		setFuncao(funcao);
		setCargo(cargo);
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}