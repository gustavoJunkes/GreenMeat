package model.dao.localidade;

import java.util.List;

import model.entities.users.Usuario;
import model.entities.users.information.Endereco;
import model.entities.users.information.Localidade;

public interface LocalidadeDAO {
	
	void inserirLocalidade(Localidade localidade);

	void deletarLocalidade(Localidade localidade);

	void atualizarLocalidade(Localidade localidade);

	Localidade recuperarLocalidadeEndereco(Endereco endereco);
	
	List<Localidade> recuperarLocalidades();
	
	List<Localidade> recuperarLocalidadesUsuario(Usuario usuario);
	
	
}
