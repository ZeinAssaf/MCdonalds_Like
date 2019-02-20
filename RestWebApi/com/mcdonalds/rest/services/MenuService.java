package com.mcdonalds.rest.services;

import java.util.List;
import com.mcdonalds.database.MenuDao;
import com.mcdonalds.rest.models.Menu;

public class MenuService {
	public MenuDao dao = new MenuDao();

	public MenuService() {
	}

	public List<Menu> getmenues() {
		return dao.getItems();
	}

	public Menu getMenuById(int id) {
		Menu menu = (Menu) dao.getItemById(id);
		return menu;
	}

	public Menu addMenu(Menu menu) {
		dao.saveItem(menu);
		return menu;
	}

	public void deleteMenu(int id) {
		dao.deleteItem(id);
	}

}
