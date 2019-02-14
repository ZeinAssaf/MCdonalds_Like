package com.mcdonalds.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.mcdonalds.rest.entities.Menu;

public class ClientClass {
	public static void main(String[] args) { 
		Client client=ClientBuilder.newClient();
		WebTarget baseUrl=client.target("http://localhost:8080/mcdonalds/api/");
		WebTarget menuTarget=baseUrl.path("menus");
		WebTarget idURI=menuTarget.path("{id}");
		
		
		//get request
		Menu menu=idURI
				.resolveTemplate("id", "2").
				request().
				get(Menu.class);
			/*	
		Invocation response=client.target("http://localhost:8080/mcdonalds/api/menus/1").queryParam("limit", 3).request().buildGet();
		
		
		//post request¨
		Menu newMenu= new Menu(5,"hakhsak");
		Response response=menuTarget.request().post(Entity.json(newMenu));
		System.out.println(response.readEntity(Menu.class));*/
		
		Response response=menuTarget.request().get();
		System.out.println(response);
		

	}

}
