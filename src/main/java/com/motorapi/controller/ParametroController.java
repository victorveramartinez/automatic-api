package com.motorapi.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.motorapi.bean.ParametroFacade;
import com.motorapi.model.Parametro;

@Path("parametro")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ParametroController {
	@EJB
	ParametroFacade parametroService;
	
	@GET
	public List<Parametro> listAll(){
		return parametroService.findAll();
	}
	
	@GET
	@Path("/{id}")
	public Parametro findById(@PathParam("id") Long id){
		return parametroService.find(id);
	}
	
	@POST
	@Path("/create")
	public Response create(Parametro parametro) {
		parametroService.create(parametro);
		return Response.created(UriBuilder.fromResource(ParametroController.class).path(String.valueOf(parametro.getId())).build()).build();
	}
	@PUT
	@Path("/update")
	public Response update(Parametro parametro) {
		parametroService.edit(parametro);
		return Response.noContent().build();
	}
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") Long id) {
		Parametro parametro = parametroService.find(id);
		parametroService.remove(parametro);
		return Response.noContent().build();
	}
}
