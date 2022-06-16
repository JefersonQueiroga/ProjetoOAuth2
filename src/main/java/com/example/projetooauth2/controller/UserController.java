package com.example.projetooauth2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("api/user")
    public ResponseEntity<String> getUse(){
        System.out.println("+====");
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

}