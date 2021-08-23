package model.entities.users;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;


@Entity
@Table(name = "funcionario")
public class Funcionario extends PessoaFisica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_funcionario")
	private Long id;
	
	@Column(name = "funcao_funcionario", length = 15, nullable = false, unique = false)
	private String funcao;

	@Column(name = "cargo_funcionario", length = 15, nullable = false, unique = false)
	private String cargo;

//	Ao criar funcionario criar tambem seu login e senha

	public Funcionario(){}
	
	public Funcionario(Localidade endereco, String login, String senha, Contato contato, String nome, String sobrenome,
			String CPF, LocalDate dataDeNascimento) {
		super(login, senha, contato, nome, sobrenome, CPF, dataDeNascimento);
		setFuncao(funcao);
		setCargo(cargo);
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}