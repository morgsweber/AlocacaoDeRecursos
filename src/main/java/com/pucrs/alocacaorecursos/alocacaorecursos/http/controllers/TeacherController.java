package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherClassesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherClassesResponse;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/professor")
public class TeacherController {

    @Autowired
    private TeacherLecturesView teacherLecturesView;

    @Autowired
    private TeacherClassesView teacherClassesView;

    @GetMapping("/horarios")
    public ResponseEntity professorHorarios() {
        System.out.println("requisicao professorHorarios ok");
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/disciplinas")
    public ResponseEntity professorTurmas() {
        System.out.println("requisicao professorTurmas ok");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/cronograma/{id}")
    public ResponseEntity professorCronograma(@PathVariable String id) {
        
        List<TeacherClassesResponse> response = teacherClassesView.getTeacherLectures(id);

        return !response.isEmpty() ? ResponseEntity.ok().body(response) : ResponseEntity.notFound().build();
    }

    @GetMapping("/turmas/{id}")
    public ResponseEntity<List<TeacherLecturesResponse>> professorDisciplinas(@PathVariable String id) {

        List<TeacherLecturesResponse> response = teacherLecturesView.getTeacherLectures(id);

        return !response.isEmpty() ? ResponseEntity.ok().body(response) : ResponseEntity.notFound().build();
    }
}