package com.koona.invoise.core;

import com.koona.invoise.controller.InvoiceControllerInterface;
import com.koona.invoise.controller.scan.InvoiceDouchetteController;
import com.koona.invoise.controller.keyboard.InvoiceKeyBoardController;
import com.koona.invoise.controller.web.InvoiceWebController;
import com.koona.invoise.entity.Invoice;
import com.koona.invoise.repository.database.InvoiceDatabaseRepository;
import com.koona.invoise.repository.memory.InvoiceMemoryRepository;
import com.koona.invoise.repository.InvoiceRepositoryInterface;
import com.koona.invoise.service.prefix.InvoicePrefixService;
import com.koona.invoise.service.number.InvoiceNumberService;
import com.koona.invoise.service.InvoiceServiceInterface;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);
        invoiceControllerInterface.createInvoice();
    }
}
