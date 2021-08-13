package model.exception.users.information;

public class EmailInvalidException extends Exception {
	
	
	public EmailInvalidException(String message) {
		super(message);
	}
	

	public String toString() {
		return "Email não existe";
	}

}