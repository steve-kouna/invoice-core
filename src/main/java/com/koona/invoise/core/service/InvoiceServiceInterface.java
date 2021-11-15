/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.service;

import com.koona.invoise.core.entity.Invoice;
import com.koona.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.List;

/**
 *
 * @author Steve KOUNA
 */
public interface InvoiceServiceInterface {
    void create(Invoice invoice);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    List<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);
}
