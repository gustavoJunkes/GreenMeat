package model.entities.products;

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
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import model.entities.users.Cliente;
import model.entities.users.Usuario;

@Entity
@Table(name = "pedido")
public class Pedido extends Usuario {
	private static final long serialVersionUID = 1L;
	
	
	/* 	
	  	valor do item = produto * quantidade
	 	valor do pedido = soma dos itens

		Precisa de um novo atributo em Status, como ENTREGUE, ou A_CAMINHO, por exemplo?
		Precisa de método para finalizar pedido
	*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Long id;
	
	
	@Column
	@OneToMany(mappedBy = "id")
	private List<Item>itens = new ArrayList<Item>();
	
	
	
	
	
//	 private Status status; 
	
	 
	 
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_cliente")
	private Cliente cliente; // dono da lista de compras
	
	
//	@OneToMany(fetch = FetchType.LAZY,mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Item> itens = new ArrayList<Item>();
	
	
	@Column(name = "data_entrega", nullable = false, unique = false)
	private LocalDate dataEntrega;

	
	@Column(name = "valor_total_pedido", nullable = false, unique = false)
	private float valorTotal; // soma do valor total de todos os itens do pedido


	public Pedido(Cliente cliente) {
		setValorTotal(0);
		setCliente(cliente); // um cliente pode ter mais de um pedido? (ao mesmo tempo)
//		setStatus(Status.PEDIDO_EM_ABERTO);
//		itens = new ArrayList<Item>(); // Esta lista deveria ser instanciada aqui ou na propria área de váriaveis?

	}



//	public Status getStatus() {
//		return status;
//	}
//
//	public void setStatus(Status status) {
//		this.status = status;
//	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	// este método retorna apenas um endereço de memoria

//	public List<Item> getItens() {
//		return itens;
//	}
//
//	public void setItens(List<Item> itens) {
//		this.itens = itens;
//	}

//	Adicionar produto à lista de produtos
// item.preco = produto * quantidade

//	public void adicionarItem(Item item) {
//
//		setValorTotal(getValorTotal() + item.getValorTotal());
//
//		itens.add(item); // adicionando um "item" à lista de itens
//	}

//	Aqui ele remove um item da Lista  (Pedido, neste caso)

//	public void removerItemDaLista(Item item) {
//
//		itens.remove(item);
//		setValorTotal(getValorTotal() - item.getValorTotal());
//	}

//	public void finalizarPedido(String idPedido) {
//		setStatus(Status.PEDIDO_FINALIZADO);
//	}

	
//	O método a seguir calcula o valor total de um pedido somando o valor total de cada item
	
//	public float calcularValorTotalPedido() {
//		int soma = 0;
//		for (int i = 0; i < itens.size(); i++) {
//			soma += itens.get(i).calculaValorTotal();
//		}
//		return soma;
//	}
}
