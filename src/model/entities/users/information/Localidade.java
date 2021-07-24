package model.entities.users.information;

public class Localidade {

	private String pais;
	private String estado;
	private String provincia;
	private String continente;
	private Endereco endereco;

	public Localidade(String pais, String estado, String provincia, String continente, Endereco endereco) {
		setPais(pais);
		setEstado(estado);
		setProvincia(provincia);
		setContinente(continente);
		setEndereco(endereco);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
