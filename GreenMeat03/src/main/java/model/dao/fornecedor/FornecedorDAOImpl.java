package model.dao.fornecedor;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.entities.products.Pedido;
import model.entities.products.Produto;
import model.entities.users.Cliente;
import model.entities.users.Fornecedor;

public class FornecedorDAOImpl implements FornecedorDAO {

	public void inserirFornecedor(Fornecedor fornecedor) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.save(fornecedor);

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

	public void deletarFornecedor(Fornecedor fornecedor) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.delete(fornecedor);

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

	public void atualizarFornecedor(Fornecedor fornecedor) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(fornecedor);

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

	
	public Fornecedor recuperarPorId(Long id) {
		Session sessao = null;
		Fornecedor fornecedor = null;
		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			fornecedor = sessao.find(Fornecedor.class, id );

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
		
		return fornecedor;
		
	}
	
	public Fornecedor recuperarFornecedorProduto(Produto produto) {

		Session sessao = null;
		Fornecedor fornecedor = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Fornecedor> criteria = construtor.createQuery(Fornecedor.class);
			Root<Fornecedor> raizFornecedor= criteria.from(Fornecedor.class);

			Join<Fornecedor, Produto> juncaoProduto = raizFornecedor.join("produtos");

			ParameterExpression<Long> idProduto= construtor.parameter(Long.class);
			criteria.where(construtor.equal(juncaoProduto.get("id"), idProduto));

			fornecedor = sessao.createQuery(criteria).setParameter(idProduto, produto.getId()).getSingleResult();

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

		return fornecedor;
	}

	
	public List<Fornecedor> recuperarFornecedores() {

		Session sessao = null;
		List<Fornecedor> fornecedores = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Fornecedor> criteria = construtor.createQuery(Fornecedor.class);
			Root<Fornecedor> raizFornecedor = criteria.from(Fornecedor.class);

			criteria.select(raizFornecedor);

			fornecedores = sessao.createQuery(criteria).getResultList();

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

		return fornecedores;

	}

	private SessionFactory conectarBanco() {

		Configuration configuracao = new Configuration();

		configuracao.addAnnotatedClass(model.entities.users.Cliente.class);
		configuracao.addAnnotatedClass(model.entities.users.Usuario.class);
		configuracao.addAnnotatedClass(model.entities.users.PessoaFisica.class);
		configuracao.addAnnotatedClass(model.entities.users.Fornecedor.class);
		configuracao.addAnnotatedClass(model.entities.users.Funcionario.class);
		configuracao.addAnnotatedClass(model.entities.users.PessoaJuridica.class);
		configuracao.addAnnotatedClass(model.entities.users.information.Contato.class);
		configuracao.addAnnotatedClass(model.entities.users.information.Endereco.class);
		configuracao.addAnnotatedClass(model.entities.users.information.Localidade.class);
		configuracao.addAnnotatedClass(model.entities.products.Estoque.class);
		configuracao.addAnnotatedClass(model.entities.products.Item.class);
		configuracao.addAnnotatedClass(model.entities.products.Pedido.class);
		configuracao.addAnnotatedClass(model.entities.products.Produto.class);

		configuracao.configure("hibernate.cfg.xml");

		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
				.build();

		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;

	}
}
