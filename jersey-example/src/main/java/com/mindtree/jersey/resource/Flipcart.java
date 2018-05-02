package com.mindtree.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/flipkart")
public class Flipcart {
	
	@GET
	@Path("/store/{clothing}")
	public Response searchProduct(@PathParam("clothing") String clothing) {
		String output="Item has been sucessfully added to cart "+clothing;
		//return "You have selected " + clothing + " and the color is " + color + " with this size " + size;
		return Response.status(200).entity(output).build();
	}
	
	
}
