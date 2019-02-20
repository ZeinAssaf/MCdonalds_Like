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
import com.mcdonalds.rest.models.Addetional;
import com.mcdonalds.rest.services.AddetionalsService;

@Path("/addetionals")
@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class AddetionalsResource {
	private AddetionalsService addetionalService = new AddetionalsService();
	private LinksMaker linksMaker = new LinksMaker();

	@GET
	public List<Addetional> getAddetionals(@Context UriInfo uriInfo) {
		List<Addetional> addetionalsList = addetionalService.getAddetionls();
		for (Addetional addetional : addetionalsList) {
			String selfLink = linksMaker.getLinkForSelf(addetional.getId(), uriInfo, addetional);
			linksMaker.addLink(selfLink, "self", addetional);
		}
		return addetionalsList;
	}

	@GET
	@Path("/{id}")
	public Addetional getAddetionalById(@PathParam("id") int id, @Context UriInfo uriInfo) {

		Addetional addetional = addetionalService.getAddetionlsById(id);
		String url = linksMaker.getLinkForSelf(id, uriInfo, addetional);
		linksMaker.addLink(url, "self", addetional);
		return addetional;
	}

	@POST
	public Response addAddetional(Addetional addetional) {
		addetionalService.addAddetional(addetional);
		return Response.status(Status.CREATED).build();
	}

	@DELETE
	@Path("{id}")
	public Response deleteMenu(int id) {
		addetionalService.deleteAddetional(id);
		return Response.status(Status.GONE).build();
	}

}
