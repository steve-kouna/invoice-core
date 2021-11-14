/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.controller.web;

import com.koona.invoise.core.controller.InvoiceControllerInterface;
import com.koona.invoise.core.entity.Invoice;
import com.koona.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author Steve KOUNA
 */
@Controller
public class InvoiceWebController implements InvoiceControllerInterface {
    
    @Autowired
    private InvoiceServiceInterface invoiceService;
    
    public void createInvoice() {
        Invoice invoice = new Invoice();
        
//        System.out.println( "What is customer name : " );
//        Scanner scanner = new Scanner(System.in);
        String customerName = "Michel";
        
        invoice.setCustomerName(customerName);
        invoiceService.create(invoice);
    }

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @RequestMapping("/invoice-home")
    public @ModelAttribute("invoices")
    List<Invoice> displayHome() {
        System.out.println("La methode display home a ete invoquee !");
        List<Invoice> invoices = invoiceService.getInvoiceList();
        return invoices;
    }
    
}
