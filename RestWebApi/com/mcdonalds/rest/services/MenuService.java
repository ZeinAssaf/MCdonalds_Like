package com.mcdonalds.rest.services;

import java.util.ArrayList;
import java.util.List;
import com.mcdonalds.rest.entities.Menu;

public class MenuService {
	private ArrayList<Menu> menuList = new ArrayList<>();

	public MenuService() {
		menuList.add(new Menu(1, "Big mac"));
		menuList.add(new Menu(2, "Big share"));
		menuList.add(new Menu(3, "Hot Wings"));
		menuList.add(new Menu(4, "McVegan"));
	}

	public List<Menu> getmenues() {
		return menuList;
	}

	public Menu getMenuById(int id) {
		for (Menu menu : menuList) {
			if (menu.getId()==id) {
				return menu;
			}
		}return null;
	}

}
