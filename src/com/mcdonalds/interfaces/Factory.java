package com.mcdonalds.interfaces;

import com.mcdonalds.enums.FoodNameEnum;

public interface Factory {
	public String name();

	public Meal getBurger(FoodNameEnum.BurgerType burgerType);

	public Meal getMenu(FoodNameEnum.MenuType menuType);

	public Meal getDrink(FoodNameEnum.DrinkType drinkType);

}
