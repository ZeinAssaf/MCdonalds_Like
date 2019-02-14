
package com.mcdonalds.rest.basicAuth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("secured")
public class SecuredResource {
	
	@GET
	@Path("/menu")
	@Produces(MediaType.TEXT_PLAIN)
	public String securemethod() {
		return "this needs login";
	}
}
