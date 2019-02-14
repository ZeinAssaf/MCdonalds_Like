package com.mcdonalds.burgers;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class Cheese implements Meal {

	@Override
	public int getPrice() {
		return 25;
	}

	@Override
	public String getName() {
		return FoodNameEnum.BurgerType.CHEESE.toString();
	}

}
