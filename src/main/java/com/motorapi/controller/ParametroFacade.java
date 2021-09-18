package com.motorapi.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.motorapi.model.Parametro;

@Stateless
public class ParametroFacade  extends AbstractFacade<Parametro>{

	@PersistenceContext(unitName="motorapi")
	private EntityManager em;
	
	public ParametroFacade() {
		super(Parametro.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
