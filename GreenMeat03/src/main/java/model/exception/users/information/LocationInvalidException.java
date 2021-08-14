package model.exception.users.information;

import model.entities.users.information.Localidade;

public class LocationInvalidException extends Exception {
	
	private Localidade localidade;

	
	
	public LocationInvalidException(Localidade localidade) {
		super();
		this.localidade = localidade;

	}
	

	public String toString() {
		return "Localidade inválida";
	}

}