package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

public class PessoaJuridica extends Usuario {

	private String CNPJ;
	private String razaoSocial;
	private String nomeFantasia;

	public PessoaJuridica(Localidade endereco, String login, String senha, Contato contato, String CNPJ,
			String razaoSocial, String nomeFantasia) {
		super(endereco, login, senha, contato);
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
