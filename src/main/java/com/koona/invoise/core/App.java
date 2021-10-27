package com.koona.invoise.core;

import com.koona.invoise.controller.InvoiceController;
import com.koona.invoise.controller.InvoiceMichelController;
import com.koona.invoise.entity.Invoice;
import com.koona.invoise.service.InvoiceMichelService;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dans quelle configuration etes-vous ?");
        int conf = scanner.nextInt();
        
        if(conf == 1) {
            InvoiceController invoice = new InvoiceController();
            invoice.createInvoice();
        } else if (conf == 2) {
            InvoiceMichelController invoiceM = new InvoiceMichelController();
            invoiceM.createInvoice();
        }
    }
}
