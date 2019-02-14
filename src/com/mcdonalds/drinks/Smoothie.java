package com.mcdonalds.drinks;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class Smoothie implements Meal {

	@Override
	public int getPrice() {
		return 40;
	}

	@Override
	public String getName() {
		return FoodNameEnum.DrinkType.SMOOTHIE.toString();
	}

}
