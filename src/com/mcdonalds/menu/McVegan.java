package com.mcdonalds.menu;

import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.interfaces.Meal;

public class McVegan implements Meal {

	@Override
	public int getPrice() {
		return 120;
	}

	@Override
	public String getName() {
		return FoodNameEnum.MenuType.MCVEGAN.toString();
	}

}
