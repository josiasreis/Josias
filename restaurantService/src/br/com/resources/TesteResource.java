package br.com.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/helloworld")
public class TesteResource {

	@Path("{id}")
	@POST
	@Consumes("text/plain")
	public void add(@PathParam("id") String id) {
		System.out.println(id);
	}

}
