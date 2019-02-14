package com.mcdonalds.rest.filters;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;
import org.glassfish.jersey.internal.util.Base64;

@Provider
public class SecurityFilter implements ContainerRequestFilter {
	/**
	 * THis is a a basic authentication filter that looks at the username and the
	 * password to authorize the user
	 */
	private static final String AUTHoRIZATION_HEADER_KEY = "Authorization";
	private static final String AUTHoRIZATION_HEADER_PREFIX = "Basic ";

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		if (requestContext.getUriInfo().getPath().contains("menus")) {
			List<String> authHeader = requestContext.getHeaders().get(AUTHoRIZATION_HEADER_KEY);
			if (authHeader != null && authHeader.size() > 0) {
				String authToken = authHeader.get(0);
				authToken = authToken.replaceFirst(AUTHoRIZATION_HEADER_PREFIX, "");
				String decodedString = Base64.decodeAsString(authToken);
				StringTokenizer tokenizer = new StringTokenizer(decodedString, ":");
				String username = tokenizer.nextToken();
				String password = tokenizer.nextToken();
				
				//Test user
				//TODO database authorization to be added later
				if ("user".equals(username) && "password".equals(password)) {
					return;
				}

			}
			Response unauthorizedStatus = Response.status(Status.UNAUTHORIZED)
					.entity("You are not allowed to access this API").build();
			requestContext.abortWith(unauthorizedStatus);

		}
	}

}
