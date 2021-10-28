package com.koona.invoise.core;

import com.koona.invoise.controller.InvoiceControllerInterface;
import com.koona.invoise.controller.InvoiceDouchetteController;
import com.koona.invoise.controller.InvoiceKeyBoardController;
import com.koona.invoise.controller.InvoiceWebController;
import com.koona.invoise.entity.Invoice;
import com.koona.invoise.repository.InvoiceDatabaseRepository;
import com.koona.invoise.repository.InvoiceMemoryRepository;
import com.koona.invoise.repository.InvoiceRepositoryInterface;
import com.koona.invoise.service.InvoicePrefixService;
import com.koona.invoise.service.InvoiceNumberService;
import com.koona.invoise.service.InvoiceServiceInterface;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);
        invoiceControllerInterface.createInvoice();
    }
}
