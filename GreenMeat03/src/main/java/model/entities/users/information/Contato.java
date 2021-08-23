package model.entities.users.information;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.Table;

import model.entities.users.Usuario;
import model.exception.users.information.EmailInvalidException;
import model.exception.users.information.PhoneNumberInvalidException;

@Entity
@Table(name = "contato")
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contato")
	private Long id;

	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	
	@Column(name = "telefone", length = 15, nullable = false, unique = true)
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
