/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core.entity;


import javax.persistence.*;

/**
 *
 * @author Steve KOUNA
 */
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_number")
    private String number;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "order_number")
    private String orderNumber;

    public Invoice() {
    }

    public Invoice(String number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public Invoice(String number, String customerName, String orderNumber) {
        this.number = number;
        this.customerName = customerName;
        this.orderNumber = orderNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
