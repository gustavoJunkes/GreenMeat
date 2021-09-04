package model.dao.pedido;

import java.util.List;

import model.entities.products.Pedido;
import model.entities.users.Cliente;

public interface PedidoDAO {

	void inserirPedido(Pedido Pedido);

	void deletarPedido(Pedido pedido);

	void atualizarPedido(Pedido pedido);
	
	List<Pedido> recuperarPedidos();
	
	List<Pedido> recuperarPedidosCliente(Cliente cliente);
	
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
