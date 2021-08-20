package model.dao.localidade;

import java.util.List;

import model.entities.users.information.Localidade;

public interface LocalidadeDAO {
	
	void inserirLocalidade(Localidade localidade);

	void deletarLocalidade(Localidade localidade);

	void atualizarLocalidade(Localidade localidade);

	List<Localidade> recuperarLocalidades();
}
