package model.exception.products;

import java.time.LocalDate;

public class ExpirationDateInvalidException extends Exception {
	
	private String dataValidade;

	
	
	public ExpirationDateInvalidException(String dataValidade) {
		super();
		this. dataValidade =  dataValidade;

	}
	

	public String toString() {
		return "Data de válidade do produto inválida";
	}

}