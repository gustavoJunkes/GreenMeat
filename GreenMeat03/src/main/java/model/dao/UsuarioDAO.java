package model.dao;

import java.util.List;

import model.entities.users.Usuario;
import model.entities.users.information.Contato;
import model.entities.users.information.Endereco;

public interface UsuarioDAO {

	void inserirUsuario(Usuario usuario);

	void deletarUsuario(Usuario usuario);

	void atualizarEndereco(Usuario usuario, Endereco novoEndereco);

	void atualizarLogin(Usuario usuario, String novoLogin);

	void atualizarSenha(Usuario usuario, String novaSenha);

	void atualizarContato(Usuario usuario, Contato novoContato);

	List<Usuario> recuperarUsuarios();

}
