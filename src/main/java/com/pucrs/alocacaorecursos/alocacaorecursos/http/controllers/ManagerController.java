package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/gestor")
public class ManagerController {
 
     
    @GetMapping("/turmas")
    public ResponseEntity gestorTurmas() {
        System.out.println("requisicao gestorTurmas ok");
        return ResponseEntity.ok().build();
    }
    @GetMapping("/turmas/aprova")
    public ResponseEntity gestorTurmasAprova() {
        System.out.println("requisicao gestorTurmasAprova ok");
        return ResponseEntity.ok().build();
    }
}