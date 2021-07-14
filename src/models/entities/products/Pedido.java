package models.entities.products;

import java.time.LocalDate;
import java.util.List;

import models.entities.users.Cliente;

public class Pedido {

	private Status status;
	private Cliente cliente; // dono da lista de compras
	private List<Item> itens;
	private int numeroPedido; // id pedido
	private LocalDate dataEntrega;
	private float valorTotal;
	
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

//	Adicionar produto à lista de produtos

	public float adicionarProduto(Produto produto, Item item) {

		// Produto é diferente de item, deveria aqui adicionar ao valor total o valor de
		// produto
		setValorTotal(getValorTotal() + produto.getPreco());

		itens.add(item); // adicionando um "item" à lista de itens

		return getValorTotal();
	}

	public void removerProdutoDaLista() {

	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
