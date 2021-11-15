/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.service.number;

import com.koona.invoise.core.entity.Invoice;
import com.koona.invoise.core.repository.InvoiceRepositoryInterface;
import com.koona.invoise.core.service.InvoiceServiceInterface;

import java.util.List;

/**
 *
 * @author Steve KOUNA
 */
//@Service
public class InvoiceNumberService implements InvoiceServiceInterface {
    
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

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return this.invoiceRepository.getById(number);
    }
}
