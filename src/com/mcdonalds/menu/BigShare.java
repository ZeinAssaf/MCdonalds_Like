package com.mcdonalds.menu;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class BigShare implements Meal {

	@Override
	public int getPrice() {
		return 100;
	}

	@Override
	public String getName() {
		return FoodNameEnum.MenuType.BIGSHARE.toString();
	}

}
