package model.dao.contato;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.entities.users.information.Contato;

public class ContatoDAOImpl implements ContatoDAO{

	public void inserirContato(Contato contato) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.save(contato);

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

	public void deletarContato(Contato contato) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.delete(contato);

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

	public void atualizarContato(Contato contato) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(contato);

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

	public List<Contato> recuperarContatos() {

		Session sessao = null;
		List<Contato> contatos = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Contato> criteria = construtor.createQuery(Contato.class);
			Root<Contato> raizContato = criteria.from(Contato.class);

			criteria.select(raizContato);

			contatos = sessao.createQuery(criteria).getResultList();

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

		return contatos;

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
