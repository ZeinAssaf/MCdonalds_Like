package com.mcdonalds.rest.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.mcdonalds.rest.Resources.AddetionalsResource;
import com.mcdonalds.rest.Resources.BurgersResource;
import com.mcdonalds.rest.Resources.DrinksResource;
import com.mcdonalds.rest.Resources.MenuResource;

@ApplicationPath("/api")
public class Config extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		/*
		 * Here i included the the resources under the baseURI "/api", note that its i
		 * could skip including them in this class because this is the only base URI i
		 * have in this project and they will be implemented under this base URI
		 * automatically
		 */

		Set<Class<?>> classSet = new HashSet<Class<?>>();
		classSet.add(MenuResource.class);
		classSet.add(DrinksResource.class);
		classSet.add(BurgersResource.class);
		classSet.add(AddetionalsResource.class);
		return classSet;

	}
}
