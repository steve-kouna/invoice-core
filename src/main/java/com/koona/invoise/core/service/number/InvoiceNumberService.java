/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.service.number;

import com.koona.invoise.core.entity.Invoice;
import com.koona.invoise.core.repository.InvoiceRepositoryInterface;
import com.koona.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

//    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    
    public Invoice create(Invoice invoice) {
        invoiceRepository.create(invoice);

        return invoice;
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }

    public Invoice getInvoiceByNumber(String number) {
        return this.invoiceRepository.getById(number);
    }
}
