package com.mcdonalds.database;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mcdonalds.rest.interfaces.FoodEntityInterface;
import com.mcdonalds.rest.models.Burger;
import com.mcdonalds.rest.models.Menu;

public class BurgersDao {
	public SessionFactory sessionFactory = null;
	public Session session = null;

	public BurgersDao() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public List<Burger> getItems() {
		List<Burger> burgers = new ArrayList<>();
		session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from burgers_db");
		burgers = query.getResultList();
		return burgers;
	}

	public Burger getItemById(int id) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		Burger burger = session.get(Burger.class, id);
		return burger;

	}

	public void saveItem(Burger burger) {
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(burger);
	}

	public void deleteItem(int id) {
		String hql="delete from menu_db where burgers_id= :id";
		session=sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();

	}

}
