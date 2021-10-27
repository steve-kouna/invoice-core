/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.service;

import com.koona.invoise.entity.Invoice;
import com.koona.invoise.repository.InvoiceRepositoryInterface;

/**
 *
 * @author Steve KOUNA
 */
public class InvoiceMichelService implements InvoiceServiceInterface {
    
    private static Long lastNumber = 112L;
    private InvoiceRepositoryInterface invoiceRepository;
    
    
    public void create(Invoice invoice) {
        invoice.setNumber("INV_" + String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
