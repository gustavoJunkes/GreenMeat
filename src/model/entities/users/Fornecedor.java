package model.entities.users;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

public class Fornecedor extends Usuario {

	private String razãoSocial;
	private String CNPJ;

	public Fornecedor(String razãoSocial, String CNPJ, Localidade localidade, String login, String senha,
			Contato contato) {
		super(localidade, login, senha, contato);
		setRazãoSocial(razãoSocial);
		setCNPJ(CNPJ);
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
