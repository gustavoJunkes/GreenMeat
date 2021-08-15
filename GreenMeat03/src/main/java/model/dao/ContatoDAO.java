package model.dao;

import java.util.List;

import model.entities.users.information.Contato;

public interface ContatoDAO {

	void inserirContato(Contato contato);

	void deletarContato(Contato contato);
	
	void atualizarEmail(Contato contato, String novoEmail);
	
	void atualizarTelefone(Contato contato, String novoTelefone);
	
	List <Contato> recuperarContatos();
}