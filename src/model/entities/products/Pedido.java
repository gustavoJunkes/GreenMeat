package model.entities.products;

import java.time.LocalDate;
import java.util.List;

import model.entities.users.Cliente;

public class Pedido {

	// valor do item = produto * quantidade
	// valor do pedido = soma dos itens

	private Status status;
	private Cliente cliente; // dono da lista de compras
	private List<Item> itens;
	private int numeroPedido; // id pedido
	private LocalDate dataEntrega;
	private float valorTotal; // valor do pedido

	//////////////////////////

	public Pedido(Cliente cliente) {
		setValorTotal(0);
		setCliente(cliente);
		setStatus(Status.EM_ABERTO);

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

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

//	Adicionar produto à lista de produtos
// item = produto * quantidade

	public void adicionarItem(Item item) {

		setValorTotal(getValorTotal() + item.getValorTotal());

		itens.add(item); // adicionando um "item" à lista de itens
	}

//	Aqui ele remove um item da Lista  (Pedido, neste caso)

	public void removerItemDaLista(Item item) {

		itens.remove(item);
		setValorTotal(getValorTotal() - item.getValorTotal());
	}

}
