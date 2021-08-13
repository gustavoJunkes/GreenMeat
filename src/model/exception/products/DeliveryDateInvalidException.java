package model.exception.products;

import java.time.LocalDate;

public class DeliveryDateInvalidException extends Exception {
	
	private LocalDate deliveryDate;

	
	
	public DeliveryDateInvalidException(LocalDate deliveryDate) {
		super();
		this. deliveryDate =  deliveryDate;

	}
	

	public String toString() {
		return " ";
	}

}