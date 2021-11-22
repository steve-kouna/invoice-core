/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.repository;

import com.koona.invoise.core.entity.Customer;
import com.koona.invoise.core.entity.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Steve KOUNA
 */
public interface CustomerRepositoryInterface extends CrudRepository<Customer, String> {
    /*
    Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);
     */
}
