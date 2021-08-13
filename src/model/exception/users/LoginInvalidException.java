package model.exception.users;

public class LoginInvalidException extends Exception{
	
	private String email;
	private String password;

	
	
	public LoginInvalidException(String email, String password) {
		super();
		this.password = password;
		this.email = email;

	}
	

	public String toString() {
		return "Email ou Senha incorreto";
	}

}