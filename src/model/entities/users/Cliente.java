package model.entities.users;

import java.time.LocalDate;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.exceptions.InvalidFieldException;

public class Cliente extends PessoaFisica {

	public Cliente(Localidade endereco, String login, String senha, Contato contato, String nome, String sobrenome,
			String CPF, LocalDate dataDeNascimento) {
		super(endereco, login, senha, contato, nome, sobrenome, CPF, dataDeNascimento);
		// TODO Auto-generated constructor stub
	}

//	Cliente (ainda?) não possui nenhum atributo
//	criar uma função para validar cpf	
// Falta validar cpf // cpf é um atributo repetido na classe Funcionario e Cliente

	
}

