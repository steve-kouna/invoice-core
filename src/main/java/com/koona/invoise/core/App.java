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

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("quel est la classe de controller ?");
        String controllerClass = scanner.nextLine();
        
        System.out.println("quel est la classe de service ?");
        String serviceClass = scanner.nextLine();
        
        System.out.println("quel est la classe de repository ?");
        String repositoryClass = scanner.nextLine();
        
        InvoiceControllerInterface invoiceControllerInterface = null;
        InvoiceServiceInterface invoiceServiceInterface = null;
        InvoiceRepositoryInterface invoiceRepositoryInterface = null;
        
        try {
            
        invoiceControllerInterface = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
        invoiceServiceInterface = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
        invoiceRepositoryInterface = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        invoiceControllerInterface.setInvoiceService(invoiceServiceInterface);
        invoiceServiceInterface.setInvoiceRepository(invoiceRepositoryInterface);
        invoiceControllerInterface.createInvoice();
    }
}
