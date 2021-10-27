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
public class InvoiceService implements InvoiceServiceInterface {
    
    private static Long lastNumber = 0L;

    public static Long getLastNumber() {
        return lastNumber;
    }

    public static void setLastNumber(Long aLastNumber) {
        lastNumber = aLastNumber;
    }
    private InvoiceRepositoryInterface invoiceRepository;

    
    public void create(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
    
    
}
