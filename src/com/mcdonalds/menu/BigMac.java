package com.mcdonalds.menu;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class BigMac implements Meal {

	@Override
	public int getPrice() {
		return 75;
	}

	@Override
	public String getName() {
		return FoodNameEnum.MenuType.BIGMAC.toString();
	}

}
