package modelo.dao.endereco;

import java.util.List;

import modelo.entitidade.usuario.informacao.Endereco;

public interface EnderecoDAO {



	void inserirEndereco(Endereco endereco);
	
	void deletarEndereco(Endereco endereco);
	
	void atualizarEndereco(Endereco endereco);

	List<Endereco> recuperarEnderecos();

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
