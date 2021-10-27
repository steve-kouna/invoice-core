package com.koona.invoise.core;

import com.koona.invoise.controller.InvoiceChamboulToutMagasin2Controller;
import com.koona.invoise.controller.InvoiceController;
import com.koona.invoise.controller.InvoiceMichelController;
import com.koona.invoise.entity.Invoice;
import com.koona.invoise.repository.InvoiceMichelRepository;
import com.koona.invoise.repository.InvoiceRepository;
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
            InvoiceService invoiceService = new InvoiceService();
            invoice.setInvoiceService(invoiceService);
            
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            
            invoice.createInvoice();
        } else if (conf == 2) {
            InvoiceMichelController invoiceM = new InvoiceMichelController();
            InvoiceMichelService invoiceMichelService = new InvoiceMichelService();
            invoiceM.setInvoiceService(invoiceMichelService);
            
            InvoiceMichelRepository invoiceMichelRepository = new InvoiceMichelRepository();
            invoiceMichelService.setInvoiceRepository(invoiceMichelRepository);
            
            invoiceM.createInvoice();
        } else if (conf == 3) {
            InvoiceMichelController invoiceM = new InvoiceMichelController();
            InvoiceService invoiceService = new InvoiceService();
            invoiceM.setInvoiceService(invoiceService);
            
            InvoiceMichelRepository invoiceMichelRepository = new InvoiceMichelRepository();
            invoiceService.setInvoiceRepository(invoiceMichelRepository);
            
            invoiceM.createInvoice();
        } else if (conf == 4) {
            InvoiceChamboulToutMagasin2Controller invoiceCTM = new InvoiceChamboulToutMagasin2Controller();
            InvoiceService invoiceService = new InvoiceService();
            invoiceCTM.setInvoiceService(invoiceService);
            
            InvoiceMichelRepository invoiceMichelRepository = new InvoiceMichelRepository();
            invoiceService.setInvoiceRepository(invoiceMichelRepository);
            
            invoiceCTM.createInvoice();
        }
        
    }
}
