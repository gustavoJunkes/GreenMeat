package model.entities.users.information;

import model.exceptions.InvalidFieldException;

public class Endereco {

	private String tipoDaVia;
	private String nomeDaRua;
	private String logradouro;
	private int numero;
	private int CEP;
	private String complemento;

	public Endereco(String tipoDaVia, String nomeDaRua, String logradouro, int numero, int CEP, String complemento) throws InvalidFieldException {
		setTipoDaVia(tipoDaVia);
		setNomeDaRua(nomeDaRua);
		setLogradouro(logradouro);
		setNumero(numero);
		setCEP(CEP);
		setComplemento(complemento);
	}

	public String getTipoDaVia() {
		return tipoDaVia;
	}

	public void setTipoDaVia(String tipoDaVia) throws InvalidFieldException {

		if (tipoDaVia.isEmpty() || tipoDaVia.isBlank())
			throw new InvalidFieldException("Campo nulo");

		this.tipoDaVia = tipoDaVia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int CEP) {
		CEP = CEP;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) throws InvalidFieldException {
		if (complemento.isBlank() || complemento.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.complemento = complemento;
	}

	public String getNomeDaRua() {
		return nomeDaRua;
	}

	public void setNomeDaRua(String nomeDaRua) throws InvalidFieldException {
		if (nomeDaRua.isBlank() || nomeDaRua.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.nomeDaRua = nomeDaRua;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}
