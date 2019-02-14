package com.mcdonalds.factories;

import com.mcdonalds.interfaces.Factory;
import com.mcdonalds.interfaces.Meal;
import com.mcdonalds.menu.BigMac;
import com.mcdonalds.menu.BigShare;
import com.mcdonalds.menu.HotWings;
import com.mcdonalds.menu.McVegan;

public class MenuFactory implements Factory {

	@Override
	public Meal getMenu(com.mcdonalds.enums.FoodNameEnum.MenuType menuType) {
		Meal menu = null;
		switch (menuType) {
		case BIGMAC:
			return menu = new BigMac();
		case BIGSHARE:
			return menu = new BigShare();
		case MCVEGAN:
			return menu = new McVegan();
		case HOTWINGS:
			return menu = new HotWings();
		}
		return menu;
	}

	@Override
	public String name() {
		return "MenuFactory";
	}

	@Override
	public Meal getBurger(com.mcdonalds.enums.FoodNameEnum.BurgerType burgerType) {
		return null;
	}

	@Override
	public Meal getDrink(com.mcdonalds.enums.FoodNameEnum.DrinkType drinkType) {
		return null;
	}

}
