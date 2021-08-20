package model.dao.pedido;

import java.util.List;

import model.entities.products.Pedido;

public interface PedidoDAO {

	void inserirPedido(Pedido Pedido);

	void deletarPedido(Pedido pedido);

	void atualizarPedido(Pedido pedido);
	
	List<Pedido> recuperarPedidos();
	
	/*
	 * List<Pedido> recuperarPedidoOrdenadosDataEntregaAscendente();
	 * 
	 * List<Pedido> recuperarPedidoOrdenadosDataEntregaDescendente();
	 * 
	 * List<Pedido> recuperarPedidoOrdenadosStatus();
	 * 
	 * List<Pedido> recuperarPedidoOrdenadosvalorTotalAscendente();
	 * 
	 * List<Pedido> recuperarPedidoOrdenadosvalorTotalDescendente();
	 */
}
