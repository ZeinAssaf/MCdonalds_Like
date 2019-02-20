package com.mcdonalds.rest.services;

import java.util.List;
import com.mcdonalds.database.BurgersDao;
import com.mcdonalds.rest.models.Burger;

public class BurgersService {
	private BurgersDao burgersDao = new BurgersDao();

	public BurgersService() {
	}

	public List<Burger> getBurgers() {
		return burgersDao.getItems();
	}

	public Burger getBurgerById(int id) {
		return burgersDao.getItemById(id);
	}

	public void addBurger(Burger burger) {
		burgersDao.saveItem(burger);
	}

	public void deleteBurger(int id) {
		burgersDao.deleteItem(id);
	}

}
