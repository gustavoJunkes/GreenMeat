package model.dao.generico;

import org.hibernate.Session;

import model.entities.users.information.Contato;

public class GenericoDAO<T extends EntidadeBase> {

	public void inserir(T t) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.save(t);

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
}
