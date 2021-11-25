
package modelo.dao.pessoa.juridica;

import java.util.List;

import modelo.entitidade.usuario.PessoaJuridica;

public interface PessoaJuridicaDAO {

	void inserirPessoaJuridica(PessoaJuridica pj);

	void deletarPessoaJuridica(PessoaJuridica pj);

	void atualizarPessoaJuridica(PessoaJuridica pj);
	
	List <PessoaJuridica>recuperarPessoasJuridicas();
}
