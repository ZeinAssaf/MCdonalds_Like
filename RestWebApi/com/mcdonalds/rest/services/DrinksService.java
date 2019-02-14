package com.mcdonalds.rest.services;

import java.util.ArrayList;
import java.util.List;

import com.mcdonalds.rest.entities.Drink;

public class DrinksService {
	private ArrayList<Drink> drinksList = new ArrayList<>();

	public DrinksService() {
		drinksList.add(new Drink(1, "Coke"));
		drinksList.add(new Drink(2, "pepsi"));
		drinksList.add(new Drink(3, "Smootie"));
		drinksList.add(new Drink(4, "Tee"));
	}

	public List<Drink> getDrinks() {
		return drinksList;
	}
}
