package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherRequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherResponseChangeDTO;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherRequestDTO;

@RestController
@RequestMapping("/professor")
public class TeacherController {

    @Autowired
    private TeacherLecturesView teacherLecturesView;

    @Autowired
    private TeacherRequestChange teacherRequestChange;

    @PostMapping("/solicitacao")
    public ResponseEntity professorSolicitacao(@RequestBody Map<String, String> request) {

        Optional<TeacherResponseChangeDTO> response = teacherRequestChange.execute(request);

        System.out.println("requisicao professorSolicitacao ok");
        
        return response.isPresent() ? ResponseEntity.status(HttpStatus.CREATED).body(response) : ResponseEntity.badRequest().build();
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