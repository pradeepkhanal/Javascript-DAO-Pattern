/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anisol.myapp.dao;

import com.anisol.myapp.entity.Customer;
import java.util.List;

/**
 *
 * @author pradeep
 */
public interface CustomerDAO {
    List<Customer>  getAll();
     Customer getById(int id);
    
}
