package model.entities.users;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.exceptions.InvalidFieldException;

public class Fornecedor extends Usuario {

//	 precisa de algum atributo para identificar o fornecedor

	private String nomeFantasia;
	private String razãoSocial;
	private String CNPJ; // Falta validar CNPJ

	public Fornecedor(String nomeFantasia, String razãoSocial, String CNPJ, Localidade localidade, String login,
			String senha, Contato contato) throws InvalidFieldException {
		super(localidade, login, senha, contato);
		setNomeFantasia(nomeFantasia);
		setRazãoSocial(razãoSocial);
		setCNPJ(CNPJ);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) throws InvalidFieldException {
		if (nomeFantasia.isBlank() || nomeFantasia.isEmpty())
			throw new InvalidFieldException("Campo nulo ");
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazãoSocial() {
		return razãoSocial;
	}

	public void setRazãoSocial(String razãoSocial) throws InvalidFieldException {
		if (razãoSocial.isBlank() || razãoSocial.isEmpty())
			throw new InvalidFieldException("Campo nulo ");
		this.razãoSocial = razãoSocial;

	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) { // Validar CNPJ aqui

		this.CNPJ = CNPJ;
	}

}
