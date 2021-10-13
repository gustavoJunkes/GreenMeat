package modelo.dao.produto;

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

import modelo.entidade.produto.Item;
import modelo.entidade.produto.Produto;
import modelo.entitidade.usuario.Fornecedor;
import modelo.entitidade.usuario.Usuario;



public class ProdutoDAOImpl implements ProdutoDAO {

	public void inserirProduto(Produto produto) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.save(produto);

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

	public void deletarProduto(Produto produto) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.delete(produto);

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

	public void atualizarProduto(Produto produto) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(produto);

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

	public Produto recuperarPorId(Long id) {
		Session sessao = null;
		Produto produto = null;
		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			produto = sessao.find(Produto.class, id);

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

		return produto;

	}
	
	public Produto recuperarProduto(Produto produto1) {
		

		return produto1;
	}


	public Produto recuperarProdutoItem(Item item) {

		Session sessao = null;
		Produto produto = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Produto> criteria = construtor.createQuery(Produto.class);
			Root<Produto> raizProduto = criteria.from(Produto.class);

			Join<Produto, Item> juncaoItem = raizProduto.join("produto");

			ParameterExpression<Long> idItem = construtor.parameter(Long.class);
			criteria.where(construtor.equal(juncaoItem.get("id"), idItem));

			produto = sessao.createQuery(criteria).setParameter(idItem, item.getId()).getSingleResult();

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

		return produto;
	}

	
	public List<Produto> recuperarPorNome(Produto produto) {

		Session sessao = null;
		List<Produto> produtos = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Produto> criteria = construtor.createQuery(Produto.class);
			Root<Produto> raizProduto = criteria.from(Produto.class);

			criteria.select(raizProduto);
			
			ParameterExpression<String> nomeProduto = construtor.parameter(String.class);
			criteria.where(construtor.equal(raizProduto.get("nome"), nomeProduto));

			produtos = sessao.createQuery(criteria).setParameter(nomeProduto, produto.getNome()).getResultList();

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

		return produtos;
	}
	
	public List<Produto> recuperarProdutos1() {
		List<Produto>produtos = null;
		Session sessao = null;
				
		sessao = conectarBanco().openSession();
		sessao.beginTransaction();
		
		
		
		sessao.close();
				
		
		return produtos;
	}

	
	
	public List<Produto> recuperarProdutos() {

		Session sessao = null;
		List<Produto> produtos = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Produto> criteria = construtor.createQuery(Produto.class);
			Root<Produto> raizProduto = criteria.from(Produto.class);

			criteria.select(raizProduto);

			produtos = sessao.createQuery(criteria).getResultList();

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

		return produtos;

	}

	public List<Produto> recuperarPorCategoria(Produto produto) {

		Session sessao = null;
		List<Produto> produtos = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Produto> criteria = construtor.createQuery(Produto.class);
			Root<Produto> raizProduto = criteria.from(Produto.class);

			criteria.select(raizProduto);

			ParameterExpression<String> categoriaProduto = construtor.parameter(String.class);
			criteria.where(construtor.equal(raizProduto.get("tipoCarne"), categoriaProduto));

			produtos = sessao.createQuery(criteria).setParameter(categoriaProduto, produto.getTipoCarne())
					.getResultList();

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
		return produtos;
	}

	public List<Produto> recuperarProdutosFornecedor(Fornecedor fornecedor) {

		Session sessao = null;
		List<Produto> produtos= null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Produto> criteria = construtor.createQuery(Produto.class);
			Root<Produto> raizProduto = criteria.from(Produto.class);

			Join<Produto, Fornecedor> juncaoFornecedor = raizProduto.join("fornecedor");

			ParameterExpression<Long> idFornecedor = construtor.parameter(Long.class);
			criteria.where(construtor.equal(juncaoFornecedor.get("id"), idFornecedor));

			produtos = sessao.createQuery(criteria).setParameter(idFornecedor, fornecedor.getId()).getResultList();

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

		return produtos;
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
