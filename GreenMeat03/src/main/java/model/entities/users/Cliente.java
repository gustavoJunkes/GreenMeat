package model.entities.users;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.exceptions.InvalidFieldException;

public class Cliente extends PessoaFisica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id;

	public Cliente(Localidade endereco, String login, String senha, Contato contato, String nome, String sobrenome,
			String CPF, LocalDate dataDeNascimento) {
		super(login, senha, contato, nome, sobrenome, CPF, dataDeNascimento);
		// TODO Auto-generated constructor stub
	}

//	Cliente (ainda?) não possui nenhum atributo
//	criar uma função para validar cpf	
// Falta validar cpf // cpf é um atributo repetido na classe Funcionario e Cliente

	
}

