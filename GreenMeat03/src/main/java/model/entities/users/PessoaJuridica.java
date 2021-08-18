package model.entities.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;


@Entity
@Table(name = "pessoajuridica")
public class PessoaJuridica extends Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "CNPJ_pessoajuridica")
	private String CNPJ;

	@Column(name = "razaosocial_pessoajuridica")
	private String razaoSocial;
	
	@Column(name = "nomefantasia_pessoajuridica")
	private String nomeFantasia;

	
	public PessoaJuridica() {}
	
	public PessoaJuridica(/*Localidade endereco,*/ String login, String senha, Contato contato, String CNPJ,
			String razaoSocial, String nomeFantasia) {
		super(login, senha);
		setCNPJ(CNPJ);
		setRazaoSocial(razaoSocial);
		setNomeFantasia(nomeFantasia);
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		CNPJ = CNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
