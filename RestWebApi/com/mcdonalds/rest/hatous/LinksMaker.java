package com.mcdonalds.rest.hatous;

import javax.ws.rs.core.UriInfo;
import com.mcdonalds.rest.Resources.AddetionalsResource;
import com.mcdonalds.rest.Resources.BurgersResource;
import com.mcdonalds.rest.Resources.DrinksResource;
import com.mcdonalds.rest.Resources.MenuResource;
import com.mcdonalds.rest.entities.AbstactFoodEntity;
import com.mcdonalds.rest.entities.Addetional;
import com.mcdonalds.rest.entities.Burger;
import com.mcdonalds.rest.entities.Drink;
import com.mcdonalds.rest.entities.Link;
import com.mcdonalds.rest.entities.Menu;

public class LinksMaker {
	public LinksMaker() {
	}

	/*
	 * This method will make the url that will be added to the item
	 */
	public String getLinkForSelf(int id, UriInfo uriInfo, AbstactFoodEntity abstactFoodEntity) {
		String url = "";
		if (abstactFoodEntity.getClass().equals(Addetional.class))
			url = uriInfo.getBaseUriBuilder().path(AddetionalsResource.class).path(Integer.toString(id)).build()
					.toString();
		if (abstactFoodEntity.getClass().equals(Menu.class))
			url = uriInfo.getBaseUriBuilder().path(MenuResource.class).path(Integer.toString(id)).build().toString();
		if (abstactFoodEntity.getClass().equals(Burger.class))
			url = uriInfo.getBaseUriBuilder().path(BurgersResource.class).path(Integer.toString(id)).build().toString();
		if (abstactFoodEntity.getClass().equals(Drink.class))
			url = uriInfo.getBaseUriBuilder().path(DrinksResource.class).path(Integer.toString(id)).build().toString();
		return url;

	}

	/*
	 * This method will add the link to the object
	 */
	public void addLink(String url, String rel, AbstactFoodEntity abstactFoodEntity) {
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		abstactFoodEntity.getLinks().add(link);
	}

}
