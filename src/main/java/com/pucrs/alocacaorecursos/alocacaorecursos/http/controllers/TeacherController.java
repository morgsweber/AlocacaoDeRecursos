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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.ScheduleWeekView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherRequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherResponseChangeDTO;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek.ScheduleWeekResponse;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;

@RestController
@RequestMapping("/professor")
public class TeacherController {

    @Autowired
    private TeacherLecturesView teacherLecturesView;

    @Autowired
    private TeacherRequestChange teacherRequestChange;

    @Autowired
    private ScheduleWeekView scheduleResponse;

    @PostMapping("/solicitacao/{teacher_id}")
    public ResponseEntity professorSolicitacao(@PathVariable String teacher_id, @RequestParam String group_id, @RequestBody Map<String, String> request) {

        Optional<TeacherResponseChangeDTO> response = teacherRequestChange.execute(teacher_id, group_id, request);

        System.out.println("requisicao professorSolicitacao ok");
        
        return response.isPresent() ? ResponseEntity.status(HttpStatus.CREATED).body(response) : ResponseEntity.badRequest().build();
    }

    @GetMapping("/cronograma")
    public ResponseEntity professorCronograma() {
        System.out.println("requisicao professorCronograma ok");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/turmas/{id}")
    public ResponseEntity<List<TeacherLecturesResponse>> professorTurmas(@PathVariable Integer id) {

        List<TeacherLecturesResponse> response = teacherLecturesView.getTeacherLectures(id);

        return !response.isEmpty() ? ResponseEntity.ok().body(response) : ResponseEntity.notFound().build();
    }

    @GetMapping("/horarios")
    public ResponseEntity<List<ScheduleWeekResponse>> professorHorarios(@RequestParam final Integer teacherId) {
        System.out.println("requisicao professorHorarios ok");
        return ResponseEntity.ok(scheduleResponse.getTeacherListSchedule(teacherId));
    }
}