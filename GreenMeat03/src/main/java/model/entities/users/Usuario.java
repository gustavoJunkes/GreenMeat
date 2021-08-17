package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.entities.users.information.NivelAcesso;

public class Usuario {

	private Localidade endereco;
	private String login; // nao vai login
	private String senha;
	private NivelAcesso nivelDeAcesso;
	private Contato contato;     	// Contato aparece na classe Usuário e Funcionario          
	private LocalDate dataCadastro;
	private String sobrenome;
	
	// Cada vez que um usuário for criado seu tipo de acesso deve ser especificado
	// de acordo com o usuario(cliente, funcionario, fornecedor).

	public Usuario() {
		
	}

	public Usuario(Localidade endereco, String login, String senha, Contato contato) {
		setEndereco(endereco);
		setLogin(login);
		setSenha(senha);
		setContato(contato);
		setDataCadastro(LocalDate.now());
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

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
