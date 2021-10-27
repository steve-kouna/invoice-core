/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.controller;

import com.koona.invoise.entity.Invoice;
import com.koona.invoise.service.InvoiceMichelService;
import com.koona.invoise.service.InvoiceService;
import com.koona.invoise.service.InvoiceServiceInterface;
import java.util.Scanner;

/**
 *
 * @author Steve KOUNA
 */
public class InvoiceMichelController implements InvoiceControllerInterface {
    
    private InvoiceServiceInterface invoiceService;
    
    public void createInvoice() {
        Invoice invoice = new Invoice();
        
//        System.out.println( "What is customer name : " );
//        Scanner scanner = new Scanner(System.in);
        String customerName = "Michel";
        
        invoice.setCustomerName(customerName);
        invoiceService.create(invoice);
    }
}
