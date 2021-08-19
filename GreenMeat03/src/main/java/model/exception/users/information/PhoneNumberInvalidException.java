package model.exception.users.information;

public class PhoneNumberInvalidException extends Exception {
	
	private String telefone;

	
	
	public PhoneNumberInvalidException(String message) {
		super(message);
	}
	

	public String toString() {
		return "Numero de telefone incorreto";
	}

}