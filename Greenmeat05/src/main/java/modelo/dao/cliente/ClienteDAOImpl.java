package modelo.dao.cliente;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import modelo.entitidade.usuario.Cliente;

public class ClienteDAOImpl implements ClienteDAO {

	public void inserirCliente(Cliente cliente) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.save(cliente);

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

	public void deletarCliente(Cliente cliente) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.delete(cliente);

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

	public void atualizarCliente(Cliente cliente) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(cliente);

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

	public Cliente recuperarPorId(Long id) {
		Session sessao = null;
		Cliente cliente = null;
		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			cliente = sessao.find(Cliente.class, id );

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
		
		return cliente;
		
	}
	
	public Cliente recuperarCliente(Cliente cliente) {
		Session sessao = null;
		Cliente clienteRecuperado = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Cliente> criteria = construtor.createQuery(Cliente.class);
			Root<Cliente> raizCliente= criteria.from(Cliente.class);

			criteria.select(raizCliente);
			
			ParameterExpression<String> loginCliente = construtor.parameter(String.class);
			criteria.where(construtor.equal(raizCliente.get("login"), loginCliente));

			clienteRecuperado = sessao.createQuery(criteria).setParameter(loginCliente, cliente.getLogin()).getSingleResult();

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

		return clienteRecuperado;
	}
	
	public List<Cliente> recuperarClientes() {

		Session sessao = null;
		List<Cliente> clientes = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Cliente> criteria = construtor.createQuery(Cliente.class);
			Root<Cliente> raizCliente = criteria.from(Cliente.class);

			criteria.select(raizCliente);

			clientes = sessao.createQuery(criteria).getResultList();

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

		return clientes;

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
