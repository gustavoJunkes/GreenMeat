package model.entities.users;

import java.util.List;

import model.entities.products.Produto;
import model.entities.users.information.Contato;
import model.entities.users.information.Localidade;

public class Fornecedor extends PessoaJuridica {

	private List<Produto> Produtos; // Quais Produtos ele fornece

	public Fornecedor(String razaoSocial, String nomeFantasia, Localidade endereco, String login, String senha,
			Contato contato, String CNPJ) {
		super(endereco, login, senha, contato, CNPJ, razaoSocial, nomeFantasia);
	}

	public List<Produto> getProdutos() {
		return Produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		Produtos = produtos;
	}

}
