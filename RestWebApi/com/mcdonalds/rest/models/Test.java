package com.mcdonalds.rest.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Menu menu= new Menu();
		menu.setId(7);
		menu.setName("BicMac");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		//session.persist(menu);
		Menu menu2=session.get(Menu.class, 1);
		session.getTransaction().commit();
		System.out.println(menu2.getName()+" "+menu2.getId());
		session.close();
		/*
		Drink drink= new Drink(9,"coke");
		Session session2=sessionFactory.openSession();
		session2.beginTransaction();
		session2.persist(drink);
		session2.getTransaction().commit();*/
		
	}

}
