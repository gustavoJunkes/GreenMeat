package model.entities.users.information;


import model.exception.users.information.EmailInvalidException;
import model.exception.users.information.PhoneNumberInvalidException;

public class Contato {

	private String email;
	private String telefone;

//	private String 
	
	public Contato(String email, String telefone) throws EmailInvalidException, PhoneNumberInvalidException {
		setEmail(email);
		setTelefone(telefone);
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailInvalidException {
		if (email.isEmpty())
			throw new EmailInvalidException("Campo nulo");
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws PhoneNumberInvalidException {
		if (telefone.isEmpty())
			throw new PhoneNumberInvalidException("Campo nulo");
		this.telefone = telefone;
	}

}
