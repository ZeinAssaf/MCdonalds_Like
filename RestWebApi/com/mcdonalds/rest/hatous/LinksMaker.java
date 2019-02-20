package com.mcdonalds.rest.hatous;

import javax.ws.rs.core.UriInfo;
import com.mcdonalds.rest.Resources.AddetionalsResource;
import com.mcdonalds.rest.Resources.BurgersResource;
import com.mcdonalds.rest.Resources.DrinksResource;
import com.mcdonalds.rest.Resources.MenuResource;
import com.mcdonalds.rest.interfaces.FoodEntityInterface;
import com.mcdonalds.rest.models.Addetional;
import com.mcdonalds.rest.models.Burger;
import com.mcdonalds.rest.models.Drink;
import com.mcdonalds.rest.models.Link;
import com.mcdonalds.rest.models.Menu;

public class LinksMaker {
	public LinksMaker() {
	}

	/*
	 * This method will make the url that will be added to the item
	 */
	public String getLinkForSelf(int id, UriInfo uriInfo, FoodEntityInterface foodEntityInterface) {
		String url = "";
		if (foodEntityInterface.getClass().equals(Addetional.class))
			url = uriInfo.getBaseUriBuilder().path(AddetionalsResource.class).path(Integer.toString(id)).build()
					.toString();
		if (foodEntityInterface.getClass().equals(Menu.class))
			url = uriInfo.getBaseUriBuilder().path(MenuResource.class).path(Integer.toString(id)).build().toString();
		if (foodEntityInterface.getClass().equals(Burger.class))
			url = uriInfo.getBaseUriBuilder().path(BurgersResource.class).path(Integer.toString(id)).build().toString();
		if (foodEntityInterface.getClass().equals(Drink.class))
			url = uriInfo.getBaseUriBuilder().path(DrinksResource.class).path(Integer.toString(id)).build().toString();
		return url;

	}

	/*
	 * This method will add the link to the object
	 */
	public void addLink(String url, String rel, FoodEntityInterface foodEntityInterface) {
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		foodEntityInterface.getLinks().add(link);
	}

}
