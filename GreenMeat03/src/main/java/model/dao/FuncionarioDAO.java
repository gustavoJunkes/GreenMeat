package model.dao;

import java.time.LocalDate;
import java.util.List;

import model.entities.users.Funcionario;
import model.entities.users.information.Contato;

public interface FuncionarioDAO {

	void inserirFuncionario(Funcionario funcionario);

//	void deletarFuncionario(Funcionario funcionario);
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

	void atualizarNomeFuncionario(String nome);

	void atualizarCpfFuncionario(String cpf);

	void atualizarDataDeNascimentoDoFuncionario(LocalDate dataDeNascimento);

	void atualizarContatoDoFuncionario(Contato contato);

	void atualizarFuncao(String funcao);

	void atualizarCarteiraDeTrabalho(String carteiraTrabalho);

	List<Funcionario> recuperarFuncionario();

}
