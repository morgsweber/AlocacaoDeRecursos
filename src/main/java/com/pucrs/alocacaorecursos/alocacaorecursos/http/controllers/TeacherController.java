package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

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

    @GetMapping("/cronograma")
    public ResponseEntity professorCronograma() {
        System.out.println("requisicao professorCronograma ok");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/turmas/{id}")
    public ResponseEntity<List<TeacherLecturesResponse>> professorTurmas(@PathVariable String id) {

        List<TeacherLecturesResponse> response = teacherLecturesView.getTeacherLectures(id);

        return !response.isEmpty() ? ResponseEntity.ok().body(response) : ResponseEntity.notFound().build();
    }
}