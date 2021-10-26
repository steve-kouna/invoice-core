/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.service;

import com.koona.invoise.entity.Invoice;
import com.koona.invoise.repository.InvoiceRepository;

/**
 *
 * @author Steve KOUNA
 */
public class InvoiceService {
    
    private static Long lastNumber = 0L;
    private final InvoiceRepository invoiceRepository;

    public InvoiceService() {
        this.invoiceRepository = new InvoiceRepository();
    }
    
    
    public void create(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
