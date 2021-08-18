package model.dao;

import java.util.List;

import model.entities.users.PessoaFisica;

public interface PessoaFisicaDAO {

	void adicionarPessoaFisica(PessoaFisica pessoaFisica);

	void removerPessoaFisica(PessoaFisica pessoaFisica);

	void atualizarPessoaFisica(PessoaFisica pessoaFisica);

	List<PessoaFisica> recuperarPessoasFisicas();

	/*
	 * List<PessoaFisica> recuperarPessoasFisicasOrdenadosNomeAscendente();
	 * 
	 * List<PessoaFisica> recuperarPessoasFisicasOrdenadosNomeDescendente();
	 * 
	 * List<PessoaFisica> recuperarPessoasFisicasOrdenadosCpfAscendente();
	 * 
	 * List<PessoaFisica> recuperarPessoasFisicasOrdenadosCpfDescendente();
	 * 
	 * List<PessoaFisica> recuperarPessoasFisicasOrdenadosIdadeAscendente();
	 * 
	 * List<PessoaFisica> recuperarPessoasFisicasOrdenadosIdadeDescendente();
	 */
}
