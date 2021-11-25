package modelo.dao.endereco;

import java.util.List;

import modelo.entitidade.usuario.informacao.Endereco;
import modelo.entitidade.usuario.informacao.Localidade;

public interface EnderecoDAO {
void inserirEndereco(Endereco endereco);
	
	void deletarEndereco(Endereco endereco);
	
	void atualizarEndereco(Endereco endereco);

	Endereco recuperarPorId(Long id);
	
	List<Endereco> recuperarEnderecos();

	List<Endereco> recuperarEnderecosLocalidade(Localidade localidade);

}
