package com.mcdonalds.rest.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstactFoodEntity {
	private int id;
	private String name;
	private List<Link> links = new ArrayList<>();

	public AbstactFoodEntity() {
	}

	public AbstactFoodEntity(int id, String name) {
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

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
