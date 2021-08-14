package model.dao;

import java.util.List;

import model.entities.products.Pedido;

public interface PedidoDAO {
	
	void adicionarPedido(Pedido Pedido);

	void removerPedido(Pedido pedido);

//	void atualizarPedido(Pedido pedido, String novoPedido);
	
//	Falta atualizar atributos de pedido

	void finalizarPedido(Pedido pedido);

	List<Pedido> mostrarPedido(Pedido pedido);

	List<Pedido> recuperarPedido();

	List<Pedido> recuperarPedidoOrdenadosDataEntregaAscendente();

	List<Pedido> recuperarPedidoOrdenadosDataEntregaDescendente();

	List<Pedido> recuperarPedidoOrdenadosStatus();

	List<Pedido> recuperarPedidoOrdenadosvalorTotalAscendente();

	List<Pedido> recuperarPedidoOrdenadosvalorTotalDescendente();
}
