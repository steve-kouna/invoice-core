/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.repository;

import com.koona.invoise.core.entity.Invoice;

import java.util.List;

/**
 *
 * @author Steve KOUNA
 */
public interface InvoiceRepositoryInterface {
    void create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);
}
