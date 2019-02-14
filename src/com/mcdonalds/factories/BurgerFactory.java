package com.mcdonalds.factories;

import com.mcdonalds.burgers.Beef;
import com.mcdonalds.burgers.Cheese;
import com.mcdonalds.burgers.Ham;
import com.mcdonalds.burgers.Mozzarella;
import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Factory;
import com.mcdonalds.interfaces.Meal;

public class BurgerFactory implements Factory {


	@Override
	public String name() {
		return "BurgerFactory";
	}
	@Override
	public Meal getBurger(FoodNameEnum.BurgerType burgerType) {
		Meal burger=null;
		switch (burgerType) {
		case CHEESE:
			return burger= new Cheese();
		case HAM:
			return burger= new Ham();
		case BEEF:
			return burger= new Beef();
		case MOZZARELLA:
			return burger= new Mozzarella();
		}
		return burger;
		
	}
	@Override
	public Meal getMenu(com.mcdonalds.enums.FoodNameEnum.MenuType menuType) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Meal getDrink(com.mcdonalds.enums.FoodNameEnum.DrinkType drinkType) {
		// TODO Auto-generated method stub
		return null;
	}



}
