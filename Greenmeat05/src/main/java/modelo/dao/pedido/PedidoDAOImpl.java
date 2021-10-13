package modelo.dao.pedido;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import modelo.entidade.produto.Pedido;
import modelo.entitidade.usuario.Cliente;
import modelo.entitidade.usuario.informacao.Contato;
import modelo.enumeracao.Status;


public class PedidoDAOImpl implements PedidoDAO {

	public void inserirPedido(Pedido pedido) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.save(pedido);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

	}

	public void deletarPedido(Pedido pedido) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.delete(pedido);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

	}

	public void atualizarPedido(Pedido pedido) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(pedido);
			
			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public Pedido recuperarPorId(Long id) {
		Session sessao = null;
		Pedido pedido = null;
		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			pedido = sessao.find(Pedido.class, id );

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
		
		return pedido;
		
	}
	
	public List<Pedido> recuperarPedidosEmAbertoCliente(Cliente cliente) {
		Session sessao = null;
		List<Pedido>pedidos = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pedido> criteria = construtor.createQuery(Pedido.class);
			Root<Pedido> raizPedido = criteria.from(Pedido.class);


			Predicate predicadoCliente = construtor.equal(raizPedido.get("cliente")	, cliente.getId());
			
			Predicate predicadoStatus = construtor.equal(raizPedido.get("status"), Status.PEDIDO_EM_ABERTO);
			
			Predicate predicadoFinal = construtor.and(predicadoCliente, predicadoStatus);
			
			criteria.where(predicadoFinal);
			pedidos = sessao.createQuery(criteria).getResultList();

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

		return pedidos;
	}
	
	
	public List<Pedido> recuperarPedidos() {

		Session sessao = null;
		List<Pedido> pedidos = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pedido> criteria = construtor.createQuery(Pedido.class);
			Root<Pedido> raizPedido = criteria.from(Pedido.class);

			criteria.select(raizPedido);

			pedidos = sessao.createQuery(criteria).getResultList();

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

		return pedidos;

	}

	public List<Pedido> recuperarPedidosCliente(Cliente cliente) {

		Session sessao = null;
		List<Pedido> pedidos = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Pedido> criteria = construtor.createQuery(Pedido.class);
			Root<Pedido> raizPedido = criteria.from(Pedido.class);

			Join<Pedido, Cliente> juncaoCliente = raizPedido.join("cliente");

			ParameterExpression<Long> idCliente = construtor.parameter(Long.class);
			criteria.where(construtor.equal(juncaoCliente.get("id"), idCliente));
			
			pedidos = sessao.createQuery(criteria).setParameter(idCliente, cliente.getId()).getResultList();

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

		return pedidos;
	}

	private SessionFactory conectarBanco() {

		Configuration configuracao = new Configuration();

		configuracao.addAnnotatedClass(modelo.entitidade.usuario.Cliente.class);
		configuracao.addAnnotatedClass(modelo.entitidade.usuario.Usuario.class);
		configuracao.addAnnotatedClass(modelo.entitidade.usuario.PessoaFisica.class);
		configuracao.addAnnotatedClass(modelo.entitidade.usuario.Fornecedor.class);
		configuracao.addAnnotatedClass(modelo.entitidade.usuario.Funcionario.class);
		configuracao.addAnnotatedClass(modelo.entitidade.usuario.PessoaJuridica.class);
		configuracao.addAnnotatedClass(modelo.entitidade.usuario.informacao.Contato.class);
		configuracao.addAnnotatedClass(modelo.entitidade.usuario.informacao.Endereco.class);
		configuracao.addAnnotatedClass(modelo.entitidade.usuario.informacao.Localidade.class);
		configuracao.addAnnotatedClass(modelo.entidade.produto.Estoque.class);
		configuracao.addAnnotatedClass(modelo.entidade.produto.Item.class);
		configuracao.addAnnotatedClass(modelo.entidade.produto.Pedido.class);
		configuracao.addAnnotatedClass(modelo.entidade.produto.Produto.class);

		configuracao.configure("hibernate.cfg.xml");

		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
				.build();

		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;

	}

}
