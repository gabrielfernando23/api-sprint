package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {

    @GetMapping("/conexao")
    public ResponseEntity conexao() {

        System.out.println("Olá mundo");
        return ResponseEntity.ok().build();
    }
}
