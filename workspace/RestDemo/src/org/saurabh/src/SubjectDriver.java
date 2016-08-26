package org.saurabh.src;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Subject")
public class SubjectDriver {
	
	@POST
	@Produces
	@Path("/add")
	public Response addSubject(
			@FormParam("id") int id,
			@FormParam("name") String name,
			@FormParam("difficulty") int difficulty
			){
		
		String result = "This is from rest/Subject/add";
		return Response.status(200).entity(result).build();
	}
