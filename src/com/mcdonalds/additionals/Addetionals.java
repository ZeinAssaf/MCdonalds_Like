package com.mcdonalds.additionals;

import com.mcdonalds.interfaces.Extras;
import com.mcdonalds.interfaces.Meal;

public abstract  class Addetionals implements Extras{

	public String desciption() {
		return "this is an additional menu to add to the main manu";
	}
	@Override
	public abstract int getPrice(Meal meal);

}
