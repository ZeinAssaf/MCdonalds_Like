package com.mcdonalds.burgers;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class Mozzarella implements Meal {

	@Override
	public int getPrice() {
		return 60;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return FoodNameEnum.BurgerType.MOZZARELLA.toString();
	}
}
