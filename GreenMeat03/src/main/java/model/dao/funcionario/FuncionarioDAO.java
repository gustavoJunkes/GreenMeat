package model.dao.funcionario;

import java.time.LocalDate;
import java.util.List;

import model.entities.users.Funcionario;
import model.entities.users.information.Contato;

public interface FuncionarioDAO {

	void inserirFuncionario(Funcionario funcionario);

	void deletarFuncionario(Funcionario funcionario);

	void atualizarFuncionario(Funcionario funcionario);

	Funcionario recuperarPorId(Long id);
	
	List<Funcionario> recuperarFuncionarios();

}
