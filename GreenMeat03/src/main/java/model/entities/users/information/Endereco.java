package model.entities.users.information;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import model.entities.users.Cliente;
import model.exceptions.InvalidFieldException;

@Entity
@Table(name = "endereco", uniqueConstraints = {@UniqueConstraint(columnNames = {"logradouro_endereco", "numero_endereco"})})
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_endereco")
	private Long id;

	/* 	private String tipoDaVia;
		private String nomeDaRua;
	*/
	
	@Column(name = "logradouro_endereco", length = 50, nullable = false)
	private String logradouro;
	
	
	@Column(name = "numero_endereco", nullable = false)
	private short numero;
	
	@Column(name = "CEP", nullable = false)
	 private int CEP; 
	
	
	@Column(name = "complemento", length = 50, nullable = true)
	private String complemento;
	
	
	@ManyToMany(mappedBy = "enderecos")
	private List<Cliente> clientes = new ArrayList<Cliente>();
	

	public Endereco(String tipoDaVia, String nomeDaRua, String logradouro, short numero, int CEP, String complemento) throws InvalidFieldException {
		/*setTipoDaVia(tipoDaVia);
		setNomeDaRua(nomeDaRua);*/
		setLogradouro(logradouro);
		setNumero(numero);
		setCEP(CEP);
		setComplemento(complemento);
	}

	/*public String getTipoDaVia() {
		return tipoDaVia;
	}

	public void setTipoDaVia(String tipoDaVia) throws InvalidFieldException {

		if (tipoDaVia.isEmpty() || tipoDaVia.isBlank())
			throw new InvalidFieldException("Campo nulo");

		this.tipoDaVia = tipoDaVia;
	}*/

	public int getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int CEP) {
		this.CEP = CEP;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) throws InvalidFieldException {
		if (complemento.isBlank() || complemento.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.complemento = complemento;
	}

	/*public String getNomeDaRua() {
		return nomeDaRua;
	}

	public void setNomeDaRua(String nomeDaRua) throws InvalidFieldException {
		if (nomeDaRua.isBlank() || nomeDaRua.isEmpty())
			throw new InvalidFieldException("Campo nulo");
		this.nomeDaRua = nomeDaRua;
	}*/

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}
