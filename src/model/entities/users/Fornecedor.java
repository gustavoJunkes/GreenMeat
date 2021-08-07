package model.entities.users;

import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;
import model.exceptions.InvalidFieldException;

public class Fornecedor extends PessoaJuridica {

//	A classe ainda não possui atributos
	
	public Fornecedor(Localidade endereco, String login, String senha, Contato contato, String CNPJ, String razaoSocial,
			String nomeFantasia) {
		super(endereco, login, senha, contato, CNPJ, razaoSocial, nomeFantasia);
	}

}
