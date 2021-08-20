package model.dao.contato;

import java.util.List;

import model.entities.users.information.Contato;

public interface ContatoDAO {

	void inserirContato(Contato contato);

	void deletarContato(Contato contato);
	
	void atualizarContato(Contato contato);
	
	List <Contato> recuperarContatos();
}
