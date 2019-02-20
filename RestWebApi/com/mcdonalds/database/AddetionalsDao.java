package com.mcdonalds.database;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.mcdonalds.rest.models.Addetional;

public class AddetionalsDao {
	public SessionFactory sessionFactory = null;
	public Session session = null;

	public AddetionalsDao() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public List<Addetional> getItems() {
		List<Addetional> addetionals = new ArrayList<>();
		session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from addetionals_db");
		addetionals = query.getResultList();
		return addetionals;
	}

	public Addetional getItemById(int id) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		Addetional addetional = session.get(Addetional.class, id);
		return addetional;

	}

	public void saveItem(Addetional addetional) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(addetional);
	}

	public void deleteItem(int id) {
		String hql = "delete from menu_db where addetionals_id= :id";
		session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();

	}

}
