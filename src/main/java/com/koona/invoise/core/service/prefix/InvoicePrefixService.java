/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.service.prefix;

import com.koona.invoise.core.entity.invoice.Invoice;
import com.koona.invoise.core.repository.CustomerRepositoryInterface;
import com.koona.invoise.core.repository.InvoiceRepositoryInterface;
import com.koona.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Autowired
    private CustomerRepositoryInterface customerRepository;
    
    @Transactional
    public Invoice create(Invoice invoice) {
        customerRepository.save(invoice.getCustomer());
        invoiceRepository.save(invoice);
        return invoice;
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

    public Iterable<Invoice> getInvoiceList() {
        return invoiceRepository.findAll();
    }

    public Invoice getInvoiceByNumber(String number) {
        return this.invoiceRepository.findById(number).orElseThrow();
    }
}
