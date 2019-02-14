package com.mcdonalds.rest.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Menu implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1847439667173214188L;
	private int id;
	private String name;
	private List<Link> links= new ArrayList<>();

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public Menu() {
	}

	public Menu(int id, String name) {
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
	public void addLink(String url,String rel) {
		Link link= new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}

}
