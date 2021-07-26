package model.entities.users;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

public class Fornecedor extends Usuario {

//	 precisa de algum atributo para identificar o fornecedor

	private String nomeFantasia;
	private String razãoSocial;
	private String CNPJ;

	public Fornecedor(String nomeFantasia, String razãoSocial, String CNPJ, Localidade localidade, String login, String senha,
			Contato contato) {
		super(localidade, login, senha, contato);
		setNomeFantasia(nomeFantasia);
		setRazãoSocial(razãoSocial);
		setCNPJ(CNPJ);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazãoSocial() {
		return razãoSocial;
	}

	public void setRazãoSocial(String razãoSocial) {

		this.razãoSocial = razãoSocial;

	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {

		this.CNPJ = CNPJ;
	}

}
