/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.repository;

import com.koona.invoise.core.entity.invoice.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * @author Steve KOUNA
 */
public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {
    @EntityGraph(value = "invoice.customer", type = EntityGraph.EntityGraphType.FETCH)
    Iterable<Invoice> findAll();
    /*
    Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);
     */
}
