
package model.dao.pessoajuridica;

import java.util.List;

import model.entities.users.PessoaJuridica;

public interface PessoaJuridicaDAO {

	void inserirPessoaJuridica(PessoaJuridica pj);

	void deletarPessoaJuridica(PessoaJuridica pj);

	void atualizarPessoaJuridica(PessoaJuridica pj);
	
	List <PessoaJuridica>recuperarPessoasJuridicas();
}
