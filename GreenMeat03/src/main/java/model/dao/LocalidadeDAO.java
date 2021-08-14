package model.dao;

import java.util.List;

import model.entities.users.information.Endereco;
import model.entities.users.information.Localidade;

public interface LocalidadeDAO {
/*
	void inserirPais(String pais);

	void inserirEstado(String estado);

	void inserirProvincia(String provincia);

	void inserirContinente(String continente);

	void inserirEndereco(Endereco endereco);
*/
	void inserirLocalidade(Localidade localidade);
	
	void atualizarPais(String pais, String novoPais);

	void atualizarEstado(String estado, String novoEstado);

	void atualizarProvincia(String provincia, String novoProvincia);

	void atualizarContinente(String continente, String novoContinente);

	void atualizarEndereco(Endereco endereco, Endereco novoEndereco);

	List<Localidade> recuperarPais();

	List<Localidade> recuperarEstado();

	List<Localidade> recuperarProvincia();

	List<Localidade> recuperarContinente();

	List<Localidade> recuperarEndereco();

}
