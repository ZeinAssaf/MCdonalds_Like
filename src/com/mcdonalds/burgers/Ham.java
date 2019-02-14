package com.mcdonalds.burgers;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class Ham implements Meal {

	@Override
	public int getPrice() {
		return 20;
	}

	@Override
	public String getName() {
		return FoodNameEnum.BurgerType.HAM.toString();
	}



}
