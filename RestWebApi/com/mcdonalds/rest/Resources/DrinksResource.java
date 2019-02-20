package com.mcdonalds.rest.Resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;
import com.mcdonalds.rest.hatous.LinksMaker;
import com.mcdonalds.rest.models.Drink;
import com.mcdonalds.rest.services.DrinksService;

@Path("/drinks")
@Produces(value= {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class DrinksResource {
	private DrinksService drinkService=new DrinksService();
	private LinksMaker linksMaker= new LinksMaker();
	@GET
	public List<Drink> getDrinks(@Context UriInfo uriInfo) {
		List<Drink>drinksList=drinkService.getDrinks();
		for (Drink drink : drinksList) {
			String selfLink=linksMaker.getLinkForSelf(drink.getId(), uriInfo,drink);
			linksMaker.addLink(selfLink, "self",drink);
		}
		return drinksList;
	}
	@GET
	@Path("/{id}")
	public Drink getAddetionalById(@PathParam("id")int id,@Context UriInfo uriInfo) {
		
		Drink drink=drinkService.getDrinksById(id);
		String url=linksMaker.getLinkForSelf(id, uriInfo,drink);
		linksMaker.addLink(url, "self",drink);
		return drink;
	}
	@POST
	public Response addDrink(Drink drink) {
		drinkService.addDrink(drink);
		return Response.status(Status.CREATED).build();
	}

	@DELETE
	@Path("{id}")
	public Response deleteMenu(int id) {
		drinkService.deleteDrink(id);
		return Response.status(Status.GONE).build();
	}

}
