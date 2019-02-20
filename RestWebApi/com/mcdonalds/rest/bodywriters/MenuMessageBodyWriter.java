package com.mcdonalds.rest.bodywriters;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.mcdonalds.rest.models.Menu;

@Provider
@Produces(MediaType.TEXT_PLAIN)
public class MenuMessageBodyWriter implements MessageBodyWriter<Menu> {
	/*
	 * This method is used to check if this provider can write the current type
	 */
	@Override
	public boolean isWriteable(Class<?> classType, Type arg1, Annotation[] arg2, MediaType arg3) {
		return Menu.class.isAssignableFrom(classType);
	}
	/*
	 * This method will do the actual conversion
	 */

	@Override
	public void writeTo(Menu menu
			,Class<?> classType
			,Type type
			,Annotation[] annotations
			, MediaType mt
			,MultivaluedMap<String, Object> map
			, OutputStream output) throws IOException, WebApplicationException {
		output.write(menu.toString().getBytes());
	}

}
