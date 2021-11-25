package modelo.dao.funcionario;

import java.time.LocalDate;
import java.util.List;

import modelo.entitidade.usuario.Funcionario;
import modelo.entitidade.usuario.informacao.Contato;

public interface FuncionarioDAO {

	void inserirFuncionario(Funcionario funcionario);

	void deletarFuncionario(Funcionario funcionario);

	void atualizarFuncionario(Funcionario funcionario);

	Funcionario recuperarPorId(Long id);
	
	Funcionario recuperarFuncionarioPorLogin(String login);
	
	Funcionario recuperarFuncionario(Funcionario funcionario);
	
	List<Funcionario> recuperarFuncionarios();

}
