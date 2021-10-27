/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.repository;

import com.koona.invoise.entity.Invoice;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steve KOUNA
 */
public class InvoiceMichelRepository  implements InvoiceRepositoryInterface {
    
    private static List<Invoice> invoices = new ArrayList<>();
    
    public void create(Invoice invoice) {
        invoices.add(invoice);
        
        System.out.println("Invoice addedd with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
