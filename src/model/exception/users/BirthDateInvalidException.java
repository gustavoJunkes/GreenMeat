package model.exception.users;

import java.time.LocalDate;

public class BirthDateInvalidException extends Exception {
	
	private LocalDate dataDeNascimento;

	
	
	public BirthDateInvalidException(LocalDate dataDeNascimento) {
		super();
		this. dataDeNascimento =  dataDeNascimento;

	}
	

	public String toString() {
		return "Data de nascimento inválida";
	}

}