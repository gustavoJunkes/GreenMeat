
package model.dao;

import java.util.List;

import model.entities.users.PessoaJuridica;

public interface PessoaJuridicaDAO {

	void inserirPessoaJuridica(PessoaJuridica pj);

	void deletarPessoaJuridica(PessoaJuridica pj);

	void atualizarCNPJ(PessoaJuridica pj, String novoCPJ);

	void atualizarRazaoSocial(PessoaJuridica pj, String novaRazaoSocial);

	void atualizarNomeFantasia(PessoaJuridica pj, String novoNomeFantasia);
	
	List <PessoaJuridica>recuperarPessoaJuridica();
}
