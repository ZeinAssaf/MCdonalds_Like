package com.mcdonalds.drinks;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class Fanta implements Meal {

	@Override
	public int getPrice() {
		return 20;
	}

	@Override
	public String getName() {
		return FoodNameEnum.DrinkType.FANTA.toString();
	}
	

}
