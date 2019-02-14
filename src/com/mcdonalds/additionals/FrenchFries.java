package com.mcdonalds.additionals;

import com.mcdonalds.interfaces.Meal;

public class FrenchFries extends Addetionals{
	

	@Override
	public int getPrice(Meal meal) {
		return meal.getPrice()+20;
	}
	

}
