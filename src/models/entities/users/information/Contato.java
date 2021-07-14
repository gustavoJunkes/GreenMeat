package models.entities.users.information;

public class Contato {

	private String email;
	private String telefone;

//	private String 
	
	public Contato(String email, String telefone) {
		setEmail(email);
		setTelefone(telefone);
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
