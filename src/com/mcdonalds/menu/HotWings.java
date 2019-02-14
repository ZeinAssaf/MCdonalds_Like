package com.mcdonalds.menu;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class HotWings implements Meal {

	@Override
	public int getPrice() {
		return 85;
	}

	@Override
	public String getName() {
		return FoodNameEnum.MenuType.HOTWINGS.toString();
	}

}
