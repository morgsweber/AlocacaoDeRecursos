package com.pucrs.alocacaorecursos.alocacaorecursos.http.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.ScheduleWeekView;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek.ScheduleWeekResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/aluno")
public class StudentController {

    @Autowired
    private ScheduleWeekView scheduleResponse;

    @GetMapping("/horarios")
    public ResponseEntity<List<ScheduleWeekResponse>> alunoHorarios(@RequestParam final Integer studentId) {
        System.out.println("requisicao alunoHorarios ok");
        return ResponseEntity.ok(scheduleResponse.getListSchedule(studentId));
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
