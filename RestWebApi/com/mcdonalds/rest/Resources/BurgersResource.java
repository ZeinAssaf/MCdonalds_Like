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
import com.mcdonalds.rest.models.Burger;
import com.mcdonalds.rest.services.BurgersService;

@Path("/burgers")
@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class BurgersResource {
	private BurgersService burgerService = new BurgersService();
	private LinksMaker linksMaker = new LinksMaker();

	@GET
	public List<Burger> getBurgers(@Context UriInfo uriInfo) {
		List<Burger> burgersList = burgerService.getBurgers();
		for (Burger burger : burgersList) {
			String url = linksMaker.getLinkForSelf(burger.getId(), uriInfo, burger);
			linksMaker.addLink(url, "self", burger);
		}
		return burgersList;
	}

	@GET
	@Path("/{id}")
	public Burger getBurgerById(@Context UriInfo uriInfo,@PathParam("id")int id) {
		Burger burger=burgerService.getBurgerById(id);
		String url=linksMaker.getLinkForSelf(id, uriInfo, burger);
		linksMaker.addLink(url, "self", burger);
		return burger;

	}
	@POST
	public Response addBurger(Burger burger) {
		burgerService.addBurger(burger);
		return Response.status(Status.CREATED).build();
	}

	@DELETE
	@Path("{id}")
	public Response deketeBurger(int id) {
		burgerService.deleteBurger(id);
		return Response.status(Status.GONE).build();
	}

}
