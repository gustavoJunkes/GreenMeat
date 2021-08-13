package model.exception.users.information;

import model.entities.users.information.Localidade;

public class CityInvalidException extends Exception {
	
	private Localidade cidade;

	
	
	public CityInvalidException(Localidade cidade) {
		super();
		this.cidade = cidade;

	}
	

	public String toString() {
		return "Cidade inválida";
	}

}