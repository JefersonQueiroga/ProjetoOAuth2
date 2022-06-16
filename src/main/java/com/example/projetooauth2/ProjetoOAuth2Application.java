package com.example.projetooauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.projetooauth2.controller"})
public class ProjetoOAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoOAuth2Application.class, args);
        System.out.println("----- Iniciou----------");
    }

}
