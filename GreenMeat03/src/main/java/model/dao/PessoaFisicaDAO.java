package model.dao;

import java.util.List;

import model.entities.users.PessoaFisica;

public interface PessoaFisicaDAO {
	void adicionarPessoaFisica(PessoaFisica pessoaFisica);

	void removerPessoaFisica(PessoaFisica pessoaFisica);

	void atualizarNome(PessoaFisica pessoaFisica, String novoNome);

	void atualizarSobrenome(PessoaFisica pessoaFisica, String novoSobrenome);

	void atualizarCPF(PessoaFisica pessoaFisica, String novoCPF);

	void atualizarDataDeNascimento(PessoaFisica pessoaFisica, String novoDataDeNascimento);

	List<PessoaFisica> recuperarPessoasFisicas();

	List<PessoaFisica> recuperarPessoasFisicasOrdenadosNomeAscendente();

	List<PessoaFisica> recuperarPessoasFisicasOrdenadosNomeDescendente();

	List<PessoaFisica> recuperarPessoasFisicasOrdenadosCpfAscendente();

	List<PessoaFisica> recuperarPessoasFisicasOrdenadosCpfDescendente();

	List<PessoaFisica> recuperarPessoasFisicasOrdenadosIdadeAscendente();

	List<PessoaFisica> recuperarPessoasFisicasOrdenadosIdadeDescendente();

}
