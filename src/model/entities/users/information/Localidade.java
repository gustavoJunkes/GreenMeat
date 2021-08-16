package model.entities.users.information;

<<<<<<< Updated upstream
=======
import model.exception.users.information.CityInvalidException;
import model.exception.users.information.CountryInvalidException;
import model.exception.users.information.InvalidAddressException;

>>>>>>> Stashed changes
public class Localidade {

	private String pais;
	private String estado;
	private String provincia;
	private String continente;
	private Endereco endereco;

<<<<<<< Updated upstream
	public Localidade(String pais, String estado, String provincia, String continente, Endereco endereco) {
=======
	public Localidade(String pais, String estado, String provincia, String continente, Endereco endereco) throws CountryInvalidException, CityInvalidException, InvalidAddressException{
>>>>>>> Stashed changes
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

	public void setProvincia(String provincia) throws CityInvalidException {
		if (pais.isBlank() || pais.isEmpty())
			throw new CityInvalidException("Campo nulo");
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

	public void setEndereco(Endereco endereco) throws InvalidAddressException {
		if (pais.isBlank() || pais.isEmpty())
			throw new InvalidAddressException("Campo nulo");
		this.endereco = endereco;
	}

}
