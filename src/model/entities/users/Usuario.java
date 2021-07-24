package model.entities.users;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.entities.users.information.NivelAcesso;

public class Usuario {

	private Localidade endereco;
	private String login;
	private String senha;
	private NivelAcesso nivelDeAcesso;
	private Contato contato;

	// Cada vez que um usu�rio for criado seu tipo de acesso deve ser especificado
	// de acordo com o usuario(cliente, funcionario, fornecedor).

	public Usuario(Localidade endereco, String login, String senha, Contato contato) {
		setEndereco(endereco);
		setLogin(login);
		setSenha(senha);
		setContato(contato);
	}

	public Localidade getEndereco() {
		return endereco;
	}

	public void setEndereco(Localidade endereco) {

		this.endereco = endereco;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {

		this.login = login;

	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public NivelAcesso getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(NivelAcesso nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}