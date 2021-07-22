package models.entities.users.information;

public class Endereco {

	private String tipoDaVia;
	private String nomeDaRua;
	private String logradouro;
	private int numero;
	private int CEP; 
	private String complemento; 

	public Endereco(String tipoDaVia, String nomeDaRua, String logradouro, int numero, int CEP, String complemento) {
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
	public void setTipoDaVia(String tipoDaVia) {
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
	public void setCEP(int cEP) {
		CEP = cEP;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNomeDaRua() {
		return nomeDaRua;
	}

	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	
	
	
}
