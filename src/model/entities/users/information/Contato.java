package model.entities.users.information;

import model.exceptions.InvalidFieldException;

public class Contato {

	private String email;
	private String telefone;

//	private String 
	
	public Contato(String email, String telefone) throws InvalidFieldException {
		setEmail(email);
		setTelefone(telefone);
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws InvalidFieldException {
		if (email.isBlank() || email.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws InvalidFieldException {
		if (telefone.isBlank() || telefone.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.telefone = telefone;
	}

}
