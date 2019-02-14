package com.mcdonalds.rest.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Menu extends AbstactFoodEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5065789441770216843L;

	public Menu() {
	}

	public Menu(int id, String name) {
		super(id, name);
	}
	

}
