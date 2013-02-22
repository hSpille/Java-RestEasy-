package de.vit.pl.restest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.vit.pl.entity.Pferd;
import de.vit.pl.entity.PferdDaoServiceFake;

@Path("/pferd")
public class PferdService {

	@Inject
	PferdDaoServiceFake pferdDaoFake;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pferd> alle() {
		return pferdDaoFake.getAll();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Pferd message(@PathParam("id") String id) {
		return pferdDaoFake.getPferdById(Long.parseLong(id));
	}
	
	@PUT
	@Path( "/{id}" )
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pferd postMessage( @PathParam("id") String id, Pferd pferd)
	{
	  Pferd pferdToModify = pferdDaoFake.getPferdById(Long.parseLong(id));
	  //should be persisted - for this example just returned
	  //pferdToModify.persist()
	  return pferd;
	}
}