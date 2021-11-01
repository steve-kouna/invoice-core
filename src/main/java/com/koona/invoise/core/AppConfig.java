/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koona.invoise.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Steve KOUNA
 */
@Configuration
@ComponentScan(basePackages = {
    "com.koona.invoise.service.prefix",
    "com.koona.invoise.controller.web",
    "com.koona.invoise.repository.database"
})
@PropertySource("classpath:application.properties")
public class AppConfig {
    
}
