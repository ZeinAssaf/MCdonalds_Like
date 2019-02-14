package com.mcdonalds.rest.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mcdonalds.rest.entities.Addetional;
import com.mcdonalds.rest.services.AddetionalsService;

@Path("/addetionals")
@Produces(value= {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class AddetionalsResource {
	private AddetionalsService addetionalServie= new AddetionalsService();
	@GET
	public List<Addetional> getAddetionals() {
		List<Addetional>addetionalsList=addetionalServie.getAddetionls();
		return addetionalsList;
	}

}
