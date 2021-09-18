package com.motorapi.controller;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.motorapi.model.Parametro;

/**
 * Session Bean implementation class ParametroBean
 */
@Stateless
@LocalBean
public class ParametroBean {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
	
    public ParametroBean() {
        // TODO Auto-generated constructor stub
    }
    @SuppressWarnings("unchecked")
	public List<Parametro> listAllParametros(){
    	return (List<Parametro>) em.find(Parametro.class, "id");    	
    }
}
