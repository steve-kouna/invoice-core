/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.repository.memory;

import com.koona.invoise.entity.Invoice;
import com.koona.invoise.repository.InvoiceRepositoryInterface;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steve KOUNA
 */
//@Repository
public class InvoiceMemoryRepository implements InvoiceRepositoryInterface {
    
    private static List<Invoice> invoices = new ArrayList<>();
    
    public void create(Invoice invoice) {
        invoices.add(invoice);
        
        System.out.println("Invoice addedd with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
