package com.mcdonalds.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.mcdonalds.rest.models.Menu;

public class ClientClass {
	public static void main(String[] args) { 
		Client client=ClientBuilder.newClient();
		WebTarget baseUrl=client.target("http://localhost:8080/mcdonalds/api/");
		WebTarget menuTarget=baseUrl.path("menus");
		WebTarget idURI=menuTarget.path("{id}");
		//get request
		Menu menu=idURI
				.resolveTemplate("id", "2")
				.request()
				.get(Menu.class);		
		Response response=menuTarget.request().get();
		System.out.println(response);
	}

}
