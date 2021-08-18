package model.entities.users.information;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;

import model.entities.users.Usuario;
import model.exception.users.information.EmailInvalidException;
import model.exception.users.information.PhoneNumberInvalidException;

public class Contato {

	private String email;
	private String telefone;

	
	@Column(name = "usuario")
	@MapsId
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
