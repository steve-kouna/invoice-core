/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.controller;

import com.koona.invoise.core.service.InvoiceServiceInterface;

/**
 *
 * @author Steve KOUNA
 */
public interface InvoiceControllerInterface {
    void createInvoice();
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
