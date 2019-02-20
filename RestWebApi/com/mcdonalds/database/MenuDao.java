package com.mcdonalds.database;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mcdonalds.rest.interfaces.FoodEntityInterface;
import com.mcdonalds.rest.models.Menu;

public class MenuDao {
	public SessionFactory sessionFactory = null;
	public Session session = null;

	public MenuDao() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public List<Menu> getItems() {
		List<Menu> menus = new ArrayList<>();
		session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from menu_db");
		menus = query.getResultList();
		return menus;
	}

	public FoodEntityInterface getItemById(int id) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		Menu menu = session.get(Menu.class, id);
		return menu;

	}

	public void saveItem(Menu menu) {
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(menu);
	}

	public void deleteItem(int id) {
		String hql="delete from menu_db where user_id= :id";
		session=sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

}
