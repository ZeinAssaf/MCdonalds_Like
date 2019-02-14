package com.mcdonalds.rest.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Drink extends AbstactFoodEntity implements Serializable{
	private static final long serialVersionUID = -128163397686303383L;

	public Drink() {
		super();
	}

	public Drink(int id, String name) {
		super(id, name);
	}
	
	
}