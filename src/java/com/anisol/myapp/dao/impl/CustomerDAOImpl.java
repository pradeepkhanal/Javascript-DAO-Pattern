/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anisol.myapp.dao.impl;

import com.anisol.myapp.dao.CustomerDAO;
import com.anisol.myapp.entity.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pradeep
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public List<Customer> getAll() {
  List<Customer> clist = new ArrayList<>();
  clist.add(new Customer(1, "Umesh", "Acharya", "umeshAchary@gmail.com", "9898997777"));
   clist.add(new Customer(2, "Ashim", "Rajaure", "pradeepkhanal@gmail.com", "9898997777"));
  
  return clist;
  
    }

    @Override
    public Customer getById(int id) {
       for(Customer c : getAll()){
           if(c.getId() == id){
               return c;
           }
       }
       return null;
    }
     
    
}
