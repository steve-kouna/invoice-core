/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.service.prefix;

import com.koona.invoise.entity.Invoice;
import com.koona.invoise.repository.InvoiceRepositoryInterface;
import com.koona.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Steve KOUNA
 */
@Service
public class InvoicePrefixService implements InvoiceServiceInterface {
    
    @Value("${invoice.lastNumber}")
    private Long lastNumber;
    
    @Value("${invoice.prefix}")
    private String prefix;

    public Long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Long aLastNumber) {
        lastNumber = aLastNumber;
    }
    
    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;
    
    
    public void create(Invoice invoice) {
        invoice.setNumber(prefix + String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
}
