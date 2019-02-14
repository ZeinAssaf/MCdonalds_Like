package com.mcdonalds.rest.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Burger extends AbstactFoodEntity implements Serializable{
	private static final long serialVersionUID = -2700418448835787928L;

	public Burger() {
		super();
	}

	public Burger(int id, String name) {
		super(id, name);
	}
	
	

}