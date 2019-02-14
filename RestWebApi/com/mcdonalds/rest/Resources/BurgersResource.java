package com.mcdonalds.rest.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mcdonalds.rest.entities.Burger;
import com.mcdonalds.rest.services.BurgersService;

@Path("/burgers")
@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class BurgersResource {
	private BurgersService burgerService= new BurgersService();
	@GET
	public List<Burger> getBurgers() {
		List<Burger> burgersList =burgerService.getBurgers();
		return burgersList;
	}

}
