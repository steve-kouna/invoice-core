package com.koona.invoise.core;

import com.koona.invoise.controller.InvoiceControllerInterface;
import com.koona.invoise.service.InvoiceServiceInterface;
import com.koona.invoise.service.prefix.InvoicePrefixService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {
//    "com.koona.invoise.service.prefix",
    "com.koona.invoise.controller.web",
    "com.koona.invoise.repository.database"
})
//@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {   
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);
        invoiceControllerInterface.createInvoice();
    }
    
    @Bean
    public InvoiceServiceInterface configInvoiceService() {
        return new InvoicePrefixService();
    }
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("application.properties"));
        return configurer;
    }
}
