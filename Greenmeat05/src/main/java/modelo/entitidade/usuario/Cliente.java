package modelo.entitidade.usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.Join;

import modelo.entidade.produto.Pedido;
import modelo.entitidade.usuario.informacao.Contato;
import modelo.entitidade.usuario.informacao.Localidade;

@Entity
@Table(name = "cliente")
public class Cliente extends PessoaFisica {
	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Pedido> Pedidos = new ArrayList<Pedido>();

	public Cliente(Localidade endereco, String login, String senha, Contato contato, String nome, String sobrenome,
			String CPF, LocalDate dataDeNascimento) {
		super(login, senha, contato, nome, sobrenome, CPF, dataDeNascimento);
		setNivelAcesso();
		// TODO Auto-generated constructor stub
	}

	public Cliente() {
		setNivelAcesso();
		// TODO Auto-generated constructor stub
	}
	
	public String getNivelAcesso() {
		nivelAcesso = "cliente";
		return nivelAcesso;
	}
	
	public void setNivelAcesso() {
		nivelAcesso = "cliente";
	}
	

	public Cliente(String login, String senha, String nome, String sobrenome,
			String CPF) {
		super(login, senha,nome, sobrenome, CPF );
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Cliente(String nome, String sobrenome, String cPF){

	
		
	}

	public List<Pedido> getPedidos() {
		return Pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		Pedidos = pedidos;
	}

	

//	Cliente (ainda?) n�o possui nenhum atributo
//	criar uma fun��o para validar cpf	
// Falta validar cpf // cpf � um atributo repetido na classe Funcionario e Cliente

	
}

