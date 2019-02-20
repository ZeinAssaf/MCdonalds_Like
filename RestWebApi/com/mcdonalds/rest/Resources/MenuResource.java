package com.mcdonalds.rest.Resources;

import com.mcdonalds.rest.hatous.LinksMaker;
import com.mcdonalds.rest.models.Menu;
import com.mcdonalds.rest.services.MenuService;
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
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

@Path("/menus")
@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class MenuResource {

	private MenuService menuService = new MenuService();
	private LinksMaker linksMaker = new LinksMaker();

	@GET
	public List<Menu> getMenu(@Context UriInfo uriInfo) {
		List<Menu> menuList = menuService.getmenues();
		for (Menu menu : menuList) {
			String url = linksMaker.getLinkForSelf(menu.getId(), uriInfo, menu);
			linksMaker.addLink(url, "self", menu);
		}
		return menuList;
	}

	@GET
	@Path("/{id}")
	public Menu getMenuById(@PathParam("id") int id, @Context UriInfo uriInfo) {
		Menu menu = menuService.getMenuById(id);
		String url = linksMaker.getLinkForSelf(id, uriInfo, menu);
		linksMaker.addLink(url, "self", menu);
		return menu;
	}

	@POST
	public Response addMenu(Menu menu) {
		menuService.addMenu(menu);
		return Response.status(Status.CREATED).build();
	}

	@DELETE
	@Path("{id}")
	public Response deleteMenu(int id) {
		menuService.deleteMenu(id);
		return Response.status(Status.GONE).build();
	}

}
