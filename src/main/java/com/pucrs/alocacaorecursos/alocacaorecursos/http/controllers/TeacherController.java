package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/professor")
public class TeacherController {

    @Autowired
    private TeacherLecturesView teacherLecturesView;

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

    @GetMapping("/disciplinas/{id}")
    public ResponseEntity<List<TeacherLecturesResponse>> professorDisciplinas(@PathVariable String id) {
        System.out.println("requisicao professorCronograma ok");
        return ResponseEntity.ok().body(teacherLecturesView.getTeacherLectures(id));

        // try {
        //     return ResponseEntity.ok().body(teacherLecturesView.getTeacherLectures(id));
        // } catch (Exception e) {
        //     return ResponseEntity.notFound().build();
        // }        
    }
}