package com.mcdonalds.rest.services;

import java.util.List;
import com.mcdonalds.database.DrinksDao;
import com.mcdonalds.rest.models.Drink;

public class DrinksService {
	private DrinksDao drinksDao = new DrinksDao();

	public DrinksService() {
	}

	public List<Drink> getDrinks() {
		return drinksDao.getItems();
	}

	public Drink getDrinksById(int id) {
		return drinksDao.getItemById(id);
	}

	public void addDrink(Drink drink) {
		drinksDao.saveItem(drink);
	}

	public void deleteDrink(int id) {
		drinksDao.deleteItem(id);
	}

}
