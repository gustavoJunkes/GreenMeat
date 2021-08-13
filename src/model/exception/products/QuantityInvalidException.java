package model.exception.products;

public class QuantityInvalidException extends Exception {
	
	private float qtd;

	
	
	public QuantityInvalidException(float qtd) {
		super();
		this.qtd = qtd;

	}
	

	public String toString() {
		return "Quantidade deve ser maior que 2";
	}

}