package model.exception.users.information;

import model.entities.users.information.Endereco;

public class InvalidAddressException extends Exception {
	
	private Endereco endereco;

	
	
	public InvalidAddressException(Endereco endereco) {
		super();
		this.endereco =  endereco;

	}
	

	public String toString() {
		return "Endereço inválido ";
	}
}
