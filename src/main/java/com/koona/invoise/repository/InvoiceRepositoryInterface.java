/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.repository;

import com.koona.invoise.entity.Invoice;

/**
 *
 * @author Steve KOUNA
 */
public interface InvoiceRepositoryInterface {
    void create(Invoice invoice);
}
