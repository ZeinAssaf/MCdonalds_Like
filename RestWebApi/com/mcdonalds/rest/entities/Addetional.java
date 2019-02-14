package com.mcdonalds.rest.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Addetional {
	private int id;
	private String name;

	public Addetional() {
	}

	public Addetional(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}