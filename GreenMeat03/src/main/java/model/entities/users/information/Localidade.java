package model.entities.users.information;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import model.entities.users.PessoaFisica;
import model.exception.users.information.CountryInvalidException;

public class Localidade extends PessoaFisica {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_localidade")
	private Long id;

	
//	Estes atributos dizem respeito a base de dados ainda não implemenntada
//	Não fazer alterações nessa classe
	
	
	@Column(name = "pais", length = 25, nullable = false, unique = true)
	private String pais;
	
	
	@Column(name = "estado", length = 25, nullable = false, unique = true)
	private String estado;
	
	
	@Column(name = "provincia", length = 25, nullable = false, unique = false)
	private String provincia;
	
	
	@Column(name = "cotinente", length = 25, nullable = false, unique = true)
	private String continente;
	
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "endereco", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Endereco> enderecos = new ArrayList<Endereco>();

	public Localidade(String pais, String estado, String provincia, String continente) throws CountryInvalidException{
		setPais(pais);
		setEstado(estado);
		setProvincia(provincia);
		setContinente(continente);

	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) throws CountryInvalidException {
		if (pais.isEmpty())
			throw new CountryInvalidException("Campo nulo");
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


}
