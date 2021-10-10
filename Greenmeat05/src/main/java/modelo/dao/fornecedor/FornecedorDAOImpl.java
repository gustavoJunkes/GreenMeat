package modelo.dao.fornecedor;

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

import modelo.entidade.produto.Estoque;
import modelo.entidade.produto.Produto;
import modelo.entitidade.usuario.Fornecedor;

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
	
	public Fornecedor recuperarFornecedorPorLogin(Fornecedor fornecedor) {
		Session sessao = null;
		Fornecedor fornecedorRecuperado = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Fornecedor> criteria = construtor.createQuery(Fornecedor.class);
			Root<Fornecedor> raizFornecedor= criteria.from(Fornecedor.class);

			criteria.select(raizFornecedor);
			
			ParameterExpression<String> loginFornecedor= construtor.parameter(String.class);
			criteria.where(construtor.equal(raizFornecedor.get("login"), loginFornecedor));

			fornecedorRecuperado = sessao.createQuery(criteria).setParameter(loginFornecedor, fornecedor.getLogin()).getSingleResult();

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

		return fornecedorRecuperado;
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

			Join<Fornecedor, Produto> juncaoProduto = raizFornecedor.join("id_fornecedor");

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

	public Fornecedor recuperarFornecedorEstoque(Estoque estoque) {

		Session sessao = null;
		Fornecedor fornecedor = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Fornecedor> criteria = construtor.createQuery(Fornecedor.class);
			Root<Fornecedor> raizFornecedor= criteria.from(Fornecedor.class);

			Join<Fornecedor, Estoque> juncaoEstoque= raizFornecedor.join("id_fornecedor");

			ParameterExpression<Long> idEstoque = construtor.parameter(Long.class);
			criteria.where(construtor.equal(juncaoEstoque.get("id"), idEstoque));

			fornecedor = sessao.createQuery(criteria).setParameter(idEstoque, fornecedor.getId()).getSingleResult();

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
