/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.controller;

import com.koona.invoise.entity.Invoice;
import com.koona.invoise.service.InvoiceServiceInterface;

/**
 *
 * @author Steve KOUNA
 */
public class InvoiceDouchetteController  implements InvoiceControllerInterface {
    
    private InvoiceServiceInterface invoiceService;

    @Override
    public void createInvoice() {
        System.out.println("Usage of scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Virgin Galactic");
        invoiceService.create(invoice);
    }

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
    
}
