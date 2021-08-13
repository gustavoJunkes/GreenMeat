package model.exception.users;

import model.entities.users.Fornecedor;

public class SupplierAlreadyRegisteredException extends Exception{
	
	private Fornecedor fornecedor;
	
	public SupplierAlreadyRegisteredException(Fornecedor fornecedor) {
		super();
		this.fornecedor = fornecedor;
		
		
	}
	

	public String toString() {
		return "Fornecedor já cadastrado";
	}

}