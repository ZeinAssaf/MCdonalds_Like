package com.mcdonalds.rest.services;

import java.util.ArrayList;
import java.util.List;

import com.mcdonalds.rest.entities.Burger;

public class BurgersService {
	private ArrayList<Burger> burgersList = new ArrayList<>();

	public BurgersService() {
		burgersList.add(new Burger(1, "meat burger"));
		burgersList.add(new Burger(2, "beaf burger"));
		burgersList.add(new Burger(3, "cheese burger"));
		burgersList.add(new Burger(4, "chicken burger"));
	}

	public List<Burger> getBurgers() {
		return burgersList;
	}
	public Burger getBurgerById(int id) {
		return burgersList.get(id);
	}
}
