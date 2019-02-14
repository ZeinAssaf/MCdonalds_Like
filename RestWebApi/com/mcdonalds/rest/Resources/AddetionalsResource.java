package com.mcdonalds.rest.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.mcdonalds.rest.entities.Addetional;
import com.mcdonalds.rest.hatous.LinksMaker;
import com.mcdonalds.rest.services.AddetionalsService;

@Path("/addetionals")
@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class AddetionalsResource {
	private AddetionalsService addetionalServie = new AddetionalsService();
	private LinksMaker linksMaker= new LinksMaker();

	@GET
	public List<Addetional> getAddetionals(@Context UriInfo uriInfo) {
		List<Addetional> addetionalsList = addetionalServie.getAddetionls();
		for (Addetional addetional : addetionalsList) {
			String selfLink=linksMaker.getLinkForSelf(addetional.getId(), uriInfo,addetional);
			linksMaker.addLink(selfLink, "self",addetional);
		}
		return addetionalsList;
	}
	
	@GET
	@Path("/{id}")
	public Addetional getAddetionalById(@PathParam("id")int id,@Context UriInfo uriInfo) {
		
		Addetional addetional=addetionalServie.getAddetionlsById(id);
		String url=linksMaker.getLinkForSelf(id, uriInfo,addetional);
		linksMaker.addLink(url, "self",addetional);
		return addetional;
	}

}
