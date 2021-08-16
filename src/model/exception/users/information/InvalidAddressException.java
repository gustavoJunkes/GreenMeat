package model.exception.users.information;

import model.entities.users.information.Endereco;

public class InvalidAddressException extends Exception {
	
	public InvalidAddressException(String mensagem) {
		super(mensagem);
		}

}