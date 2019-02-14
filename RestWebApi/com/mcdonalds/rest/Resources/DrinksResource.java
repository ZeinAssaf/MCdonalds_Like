package com.mcdonalds.rest.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mcdonalds.rest.entities.Drink;
import com.mcdonalds.rest.services.DrinksService;

@Path("/drinks")
@Produces(value= {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class DrinksResource {
	private DrinksService drinkService=new DrinksService();
	@GET
	public List<Drink> getDrinks() {
		List<Drink>drinksList=drinkService.getDrinks();
		return drinksList;
	}

}
