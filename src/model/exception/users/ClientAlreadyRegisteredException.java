package model.exception.users;

import model.entities.users.Cliente;

public class ClientAlreadyRegisteredException extends Exception{
	
	private Cliente client;
	
	public ClientAlreadyRegisteredException(Cliente client) {
		super();
		this.client = client;
		
		
	}
	

	public String toString() {
		return "Cliente já cadastrado";
	}

}