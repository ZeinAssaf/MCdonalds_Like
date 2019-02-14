package com.mcdonalds.rest.Resources;
import com.mcdonalds.rest.entities.Menu;
import com.mcdonalds.rest.services.MenuService;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;



@Path("/menus")
@Produces(value= {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class MenuResource {
	
	
	private MenuService foodservice = new MenuService();

	@GET
	public List<Menu> getMenu(@Context UriInfo uriInfo) {
		List<Menu>menuList=foodservice.getmenues();
		for (Menu menu : menuList) {
			String link =getLinkForSelf(menu.getId(), uriInfo);
			menu.addLink(link,"self");
		}
		return menuList;
	}
	@GET
	@Path("/{id}")
	public Menu getMenuById(@PathParam("id") int id,@Context UriInfo uriInfo) {
		String asd = getLinkForSelf(id, uriInfo);
		Menu menu= foodservice.getMenuById(id);
		
		menu.addLink(asd,"self");
		return menu;
	}
	private String getLinkForSelf(int id, UriInfo uriInfo) {
		String url=uriInfo.getBaseUriBuilder()
				.path(MenuResource.class)
				.path(Integer.toString(id))
				.build()
				.toString();
		return url;
	}
}
