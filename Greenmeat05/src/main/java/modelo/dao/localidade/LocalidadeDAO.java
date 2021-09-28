package modelo.dao.localidade;

import java.util.List;

import modelo.entitidade.usuario.Usuario;
import modelo.entitidade.usuario.informacao.Endereco;
import modelo.entitidade.usuario.informacao.Localidade;

public interface LocalidadeDAO {
	
	void inserirLocalidade(Localidade localidade);

	void deletarLocalidade(Localidade localidade);

	void atualizarLocalidade(Localidade localidade);

	Localidade recuperarLocalidadeEndereco(Endereco endereco);
	
	List<Localidade> recuperarLocalidades();
	
	List<Localidade> recuperarLocalidadesUsuario(Usuario usuario);
	
	
}
