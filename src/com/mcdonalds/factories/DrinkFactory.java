package com.mcdonalds.factories;

import com.mcdonalds.drinks.CocaCola;
import com.mcdonalds.drinks.CoclaColaZero;
import com.mcdonalds.drinks.Fanta;
import com.mcdonalds.drinks.Smoothie;
import com.mcdonalds.interfaces.Factory;
import com.mcdonalds.interfaces.Meal;

public class DrinkFactory implements Factory {

	
	@Override
	public Meal getDrink(com.mcdonalds.enums.FoodNameEnum.DrinkType drinkType) {
		Meal drink = null;
		switch (drinkType) {
		case COCACOLA:
			return drink = new CocaCola();
		case ZERO:
			return drink = new CoclaColaZero();
		case FANTA:
			return drink = new Fanta();
		case SMOOTHIE:
			return drink = new Smoothie();
		}
		return drink;
	}

	@Override
	public String name() {
		return "";
	}

	@Override
	public Meal getBurger(com.mcdonalds.enums.FoodNameEnum.BurgerType burgerType) {
		return null;
	}

	@Override
	public Meal getMenu(com.mcdonalds.enums.FoodNameEnum.MenuType menuType) {
		return null;
	}
}
