package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/aluno")
public class StudentController {

    @GetMapping("/horarios")
    public ResponseEntity alunoHorarios() {
        System.out.println("requisicao alunoHorarios ok");
        return ResponseEntity.ok().build();
    }
    @GetMapping("/turmas")
    public ResponseEntity alunoTurmas() {
        System.out.println("requisicao alunoTurmas ok");
        return ResponseEntity.ok().build();
    }
    @GetMapping("/cronograma")
    public ResponseEntity alunoCronograma() {
        System.out.println("requisicao alunoCronograma ok");
        return ResponseEntity.ok().build();
    }
}
