package model.exception.products;

import model.entities.products.Produto;
import model.entities.users.Fornecedor;

public class ProductAlreadyRegisteredException extends Exception{
	
	private Produto produto;
	private Fornecedor fornecedor;
	
	public ProductAlreadyRegisteredException(Produto produto, Fornecedor fornecedor) {
		super();
		this.produto = produto;
		this.fornecedor = fornecedor;
		
		
	}
	

	public String toString() {
		return "Produto já cadastrado";
	}

}