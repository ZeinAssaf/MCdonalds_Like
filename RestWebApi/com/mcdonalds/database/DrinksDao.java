package com.mcdonalds.database;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mcdonalds.rest.interfaces.FoodEntityInterface;
import com.mcdonalds.rest.models.Drink;
import com.mcdonalds.rest.models.Menu;

public class DrinksDao {
	public SessionFactory sessionFactory = null;
	public Session session = null;

	public DrinksDao() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public List<Drink> getItems() {
		List<Drink> drinks = new ArrayList<>();
		session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from drinks_db");
		drinks = query.getResultList();
		return drinks;
	}

	public Drink getItemById(int id) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		Drink drink = session.get(Drink.class, id);
		return drink;

	}

	public void saveItem(Drink drink) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(drink);
	}

	public void deleteItem(int id) {
		String hql="delete from menu_db where drink_id= :id";
		session=sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

}
