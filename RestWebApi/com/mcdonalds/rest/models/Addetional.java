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
@Table(name = "addetionals_db")
@XmlRootElement
public class Addetional implements Serializable,FoodEntityInterface {
	private static final long serialVersionUID = -6064784564211764989L;
	@Id
	private int id;
	private String name;
	@Transient
	private List<Link> links = new ArrayList<>();

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

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
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