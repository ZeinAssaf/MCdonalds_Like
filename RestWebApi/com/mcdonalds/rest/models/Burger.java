package com.mcdonalds.rest.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import com.mcdonalds.rest.interfaces.FoodEntityInterface;
@Entity
@Table(name="burgers_db")
@XmlRootElement
public class Burger implements Serializable,FoodEntityInterface {
	private static final long serialVersionUID = -2700418448835787928L;
	@Id
	private int id;
	private String name;
	@Transient
	private List<Link> links = new ArrayList<>();

	public Burger() {
	}

	public Burger(int id, String name) {
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

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

}