package model.entities.users;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// um usuario possui diversas localidades, rela��o de N pra N

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_localidade", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_localidade"))
	private List<Localidade> localidades;

	@Column(name = "login_usuario")
	private String login; // nao vai login

	@Column(name = "senha_usuario")
	private String senha;

	// Dizendo que um usuario pode ter varios contatos e que um contato pode pertencer apenas a um usuario
	// mappedBy deve ser usado em usuario, em contato deve ser usado o JoinColumn
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Contato> contatos; 
	
	
	@Column(name = "datacastro_usuario")
	@ManyToOne(fetch = FetchType.LAZY)
	private LocalDate dataCadastro;
	

	// Cada vez que um usu�rio for criado seu tipo de acesso deve ser especificado
	// de acordo com o usuario(cliente, funcionario, fornecedor).

	public Usuario() {

	}

	public Usuario(/*Localidade endereco,*/ String login, String senha /*Contato contato*/) {
//		setEndereco(endereco);
		setLogin(login);
		setSenha(senha);
//		setContato(contato);
		setDataCadastro(LocalDate.now());
	}

	public List<Localidade> getEndereco() {
		return localidades;
	}

	public void setEndereco(List<Localidade> localidades) {

		this.localidades = localidades;
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



	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Localidade> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidade> localidades) {
		this.localidades = localidades;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
