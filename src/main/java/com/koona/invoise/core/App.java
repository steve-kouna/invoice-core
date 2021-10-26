package com.koona.invoise.core;

import com.koona.invoise.entity.Invoice;
import com.koona.invoise.service.InvoiceService;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InvoiceService invoiceService = new InvoiceService();
        Invoice invoice = new Invoice();
        System.out.println( "What is customer name : " );
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        invoice.setCustomerName(customerName);
        invoiceService.create(invoice);
    }
}
