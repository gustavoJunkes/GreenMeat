package modelo.dao.contato;

import java.util.List;

import modelo.entitidade.usuario.Usuario;
import modelo.entitidade.usuario.informacao.Contato;

public interface ContatoDAO {

	void inserirContato(Contato contato);

	void deletarContato(Contato contato);
	
	void atualizarContato(Contato contato);
	
	List <Contato> recuperarContatos();
	
	List<Contato> recuperarContatosUsuario(Usuario usuario);

	Contato recuperarPorId(Long id);
}
