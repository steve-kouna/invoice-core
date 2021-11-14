/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.repository.database;

import com.koona.invoise.core.entity.Invoice;
import com.koona.invoise.core.repository.InvoiceRepositoryInterface;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steve KOUNA
 */
@Repository
public class InvoiceDatabaseRepository  implements InvoiceRepositoryInterface {
    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("NUM_1");
        invoice1.setCustomerName("EDF");

        Invoice invoice2 = new Invoice();
        invoice2.setNumber("NUM_2");
        invoice2.setCustomerName("CEB");

        return List.of(invoice1, invoice2);
    }

    private static List<Invoice> invoices = new ArrayList<>();
    
    public void create(Invoice invoice) {
        invoices.add(invoice);
        
        System.out.println("Database : Invoice addedd with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
