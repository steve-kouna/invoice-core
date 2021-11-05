/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.controller.keyboard;

import com.koona.invoise.controller.InvoiceControllerInterface;
import com.koona.invoise.entity.Invoice;
import com.koona.invoise.service.InvoiceServiceInterface;
import java.util.Scanner;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Steve KOUNA
 */
//@Controller
public class InvoiceKeyBoardController implements InvoiceControllerInterface{
    
    private InvoiceServiceInterface invoiceService;
    
    public void createInvoice() {
        Invoice invoice = new Invoice();
        
        System.out.println( "What is customer name : " );
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        
        invoice.setCustomerName(customerName);
        invoiceService.create(invoice);
    }

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
    
}
