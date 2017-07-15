/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anisol.myapp.api;

import com.anisol.myapp.dao.CustomerDAO;
import com.anisol.myapp.dao.impl.CustomerDAOImpl;
import com.anisol.myapp.entity.Customer;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author pradeep
 */
@Path(value = "customer")
public class CustomerAPI {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CustomerAPI
     */
    public CustomerAPI() {
    }
private CustomerDAO cDAO= new  CustomerDAOImpl();
   
    @GET
    @Produces(value = "application/json")
    public List<Customer> index() {
       return cDAO.getAll();
       }
    
    @GET
    @Path(value="/{id}")
    public Customer byId(@PathParam(value = "id")int id ){
        return cDAO.getById(id);
    }
     
    @POST
    @Path(value = "/save")
    public String save(@FormParam("name")String name){
        return "hello" + name;   
}
}
