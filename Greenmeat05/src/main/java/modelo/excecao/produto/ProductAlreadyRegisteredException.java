package modelo.excecao.produto;

public class ProductAlreadyRegisteredException extends Exception {

	public ProductAlreadyRegisteredException(String mensagem) {
		super(mensagem);

	}
}