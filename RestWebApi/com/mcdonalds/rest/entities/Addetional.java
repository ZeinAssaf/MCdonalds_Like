package com.mcdonalds.rest.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Addetional extends AbstactFoodEntity implements Serializable{
	private static final long serialVersionUID = -6064784564211764989L;

	public Addetional() {
		super();
	}

	public Addetional(int id, String name) {
		super(id, name);
	}
}