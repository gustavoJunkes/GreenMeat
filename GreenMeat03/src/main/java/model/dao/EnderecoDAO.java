package model.dao;

import java.util.List;

import model.entities.users.information.Endereco;

public interface EnderecoDAO {

	/*
	 * void inserirTipoDaVia(String tipoDaVia);
	 * 
	 * 
	 * void inserirNomeDaRua(String nomeDaRua);
	 * 
	 * void inserirLogradouro(String logradouro);
	 * 
	 * void inserirNumero(int numero);
	 * 
	 * void inserirCep(int cep);
	 * 
	 * void inserirComplemento(String complemento);
	 * 
	 */

	void inserirEndereco(Endereco endereco);
	
	void deletarEndereco(Endereco endereco);
	
	void atualizarTipoDaVia(String tipoDaVia, String novoTipoDaVia);

	void atualizarNomeDaRua(String nomeDaRua, String novoNomeDaRua);

	void atualizarLogradouro(String logradouro, String Logradouro);

	void atualizarNumero(int numero, int novoNumero);

	void atualizarCep(int cep, int novoCep);

	void atualizarComplemento(String complemento, String novoComplemento);

	List<Endereco> recuperarEndereco();

	/*
	 * List<Endereco> recuperarNomeDaRua();
	 * 
	 * List<Endereco> recuperarLogradouro();
	 * 
	 * List<Endereco> recuperarNumero();
	 * 
	 * List<Endereco> recuperarCep();
	 * 
	 * List<Endereco> recuperarComplemento();
	 * 
	 */

}
