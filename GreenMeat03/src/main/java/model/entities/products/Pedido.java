package model.entities.products;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import model.entities.users.Cliente;

@Entity
@Table(name = "Pedido")
public class Pedido implements Serializable{

	// valor do item = produto * quantidade
	// valor do pedido = soma dos itens

//	Precisa de um novo atributo em Status, como ENTREGUE, ou A_CAMINHO, por exemplo?
//	Precisa de método para finalizar pedido

	
	@Id
	@Column(nome = id_pedido)
	private long id;
	
	@Column(nome = valor_total)
	private float valorTotal; // valor do pedido
	  
	@Colunm( nome = data_entrega)
	private LocalDate dataEntrega;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColunm(name = status)
	private Status status;
	
	
	private Cliente cliente; // dono da lista de compras
	
	@ManyToMany(mappedBy = "itens")
	private List<Item> itens; // Esta lista deveria ser instanciada aqui ou no construtor?
	
	
	

	//////////////////////////

	public Pedido(Cliente cliente) {
		setValorTotal(0);
		setCliente(cliente); // um cliente pode ter mais de um pedido? (ao mesmo tempo)
		setStatus(status.PEDIDO_EM_ABERTO);
		itens = new ArrayList<Item>(); // Esta lista deveria ser instanciada aqui ou na propria área de váriaveis?

	}

	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
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

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

//	Adicionar produto à lista de produtos
// item.preco = produto * quantidade

	public void adicionarItem(Item item) {

		setValorTotal(getValorTotal() + item.getValorTotal());

		itens.add(item); // adicionando um "item" à lista de itens
	}

//	Aqui ele remove um item da Lista  (Pedido, neste caso)

	public void removerItemDaLista(Item item) {

		itens.remove(item);
		setValorTotal(getValorTotal() - item.getValorTotal());
	}

	public void finalizarPedido(String idPedido) {
		setStatus(status.PEDIDO_FINALIZADO);
	}

	
//	O método a seguir calcula o valor total de um pedido somando o valor total de cada item
	
	public float calcularValorTotalPedido() {
		int soma = 0;
		for (int i = 0; i < itens.size(); i++) {
			soma += itens.get(i).calculaValorTotal();
		}
		return soma;
	}
}
