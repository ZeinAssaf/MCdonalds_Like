package com.mcdonalds.additionals;

import com.mcdonalds.interfaces.Meal;

public class Cheese extends Addetionals{

	@Override
	public int getPrice(Meal meal) {
		return meal.getPrice()+40;
	}
	

}
