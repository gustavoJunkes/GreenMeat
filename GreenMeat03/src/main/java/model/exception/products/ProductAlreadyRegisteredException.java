package model.exception.products;

import model.entities.products.Produto;


public class ProductAlreadyRegisteredException extends Exception{
	
	private Produto produto;
	public ProductAlreadyRegisteredException(Produto produto) {
		super();
		this.produto = produto;
	}
	public String toString() {
		return "O Produto " + produto + " já está cadastrado";
	}

}