package com.example.projetooauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/oauth")
public class HomeController {

    @GetMapping("/callback")
    public ResponseEntity<?> getAuthorizationCode(@RequestParam("code") String code, @RequestParam("state") String state){
        System.out.println("+====");
        return ResponseEntity.ok().body(code + " - " + state);
    }

}