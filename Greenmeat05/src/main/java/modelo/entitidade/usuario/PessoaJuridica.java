package modelo.entitidade.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import modelo.entitidade.usuario.informacao.Contato;

@Entity
@Table(name = "pessoa_juridica")
public abstract class PessoaJuridica extends Usuario {

	/**
	 * @Column(name = "logradouro_endereco", )
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "cnpj")
	private String CNPJ;

	@Column(name = "razao_social")
	private String razaoSocial;

	@Column(name = "nome_fantasia")
	private String nomeFantasia;

	public PessoaJuridica() {
	}

	public PessoaJuridica(/* Localidade endereco, */ String login, String senha, Contato contato, String CNPJ,
			String razaoSocial, String nomeFantasia) {
		super(login, senha);
		setCNPJ(CNPJ);
		setRazaoSocial(razaoSocial);
		setNomeFantasia(nomeFantasia);
	}
	
	public PessoaJuridica(/* Localidade endereco, */ String login, String senha, String CNPJ,
			String razaoSocial, String nomeFantasia) {
		super(login, senha);
		setCNPJ(CNPJ);
		setRazaoSocial(razaoSocial);
		setNomeFantasia(nomeFantasia);
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
