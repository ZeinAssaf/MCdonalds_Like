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
		
		Set<Class<?>>classSet=new HashSet<Class<?>>();
		classSet.add(MenuResource.class);
		classSet.add(DrinksResource.class);
		classSet.add(BurgersResource.class);
		classSet.add(AddetionalsResource.class);
		return classSet;
		
	}
}
