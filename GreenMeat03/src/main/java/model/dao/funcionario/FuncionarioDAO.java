package model.dao.funcionario;

import java.time.LocalDate;
import java.util.List;

import model.entities.users.Funcionario;
import model.entities.users.information.Contato;

public interface FuncionarioDAO {

	void inserirFuncionario(Funcionario funcionario);

	void deletarFuncionario(Funcionario funcionario);
//
//	void inserirNomeFuncionario(String nome);
//
//	void inserirCpfFuncionario(String cpf);
//
//	void inserirDataDeNascimentoDoFuncionario(LocalDate dataDeNascimento);
//
//	void inserirContatoDoFuncionario(Contato contato);
//
//	void inserirFuncao(String funcao);
//
//	void inserirCarteiraDeTrabalho(String carteiraTrabalho);

	void atualizarFuncionario(Funcionario funcionario);

	List<Funcionario> recuperarFuncionarios();

}
