package model.dao.usuario;

import java.util.List;

import model.entities.users.Usuario;

public interface UsuarioDAO {

	void inserirUsuario(Usuario usuario);
	
	void deletarUsuario(Usuario usuario);
	
	void atualizarUsuario(Usuario usuario);
	
	List<Usuario> recuperarUsuarios();	
	
}
