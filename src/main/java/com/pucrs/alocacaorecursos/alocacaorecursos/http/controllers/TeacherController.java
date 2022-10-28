package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/professor")
public class TeacherController {

    @GetMapping("/horarios")
    public ResponseEntity professorHorarios() {
        System.out.println("requisicao professorHorarios ok");
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/turmas")
    public ResponseEntity professorTurmas() {
        System.out.println("requisicao professorTurmas ok");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/cronograma")
    public ResponseEntity professorCronograma() {
        System.out.println("requisicao professorCronograma ok");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/disciplinas")
    public ResponseEntity professorDisciplinas() {
        System.out.println("requisicao professorCronograma ok");
        return ResponseEntity.ok().build();
    }
}