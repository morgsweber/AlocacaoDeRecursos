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
import com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase.RequestClassroomExchange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestResult;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek.ScheduleWeekResponse;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherResponseChangeDTO;

@RestController
@RequestMapping("/professor")
public class TeacherController {

    @Autowired
    private TeacherLecturesView teacherLecturesView;

    @Autowired
    private TeacherRequestChange teacherRequestChange;

    @Autowired
    private ScheduleWeekView scheduleResponse;

    @Autowired
    private RequestClassroomExchange requestClassroomExchange;

    @PostMapping("/solicitacao/{teacher_id}")
    public ResponseEntity professorSolicitacao(@PathVariable Integer teacher_id, @RequestParam Integer group_id, @RequestBody Map<String, String> request) {

        Optional<TeacherResponseChangeDTO> response = teacherRequestChange.execute(teacher_id, group_id, request);

        return response.isPresent() ? ResponseEntity.status(HttpStatus.CREATED).body(response) : ResponseEntity.badRequest().build();
    }

    @GetMapping("/solicitacao/resultado")
    public ResponseEntity professorCronograma(@RequestParam Integer requestId) {

        final Optional<RequestResult> response = requestClassroomExchange.getRequestResult(requestId);

        return response.isPresent() ? ResponseEntity.ok(response.get()) : ResponseEntity.notFound().build();
    }

    @GetMapping("/turmas/{id}")
    public ResponseEntity<List<TeacherLecturesResponse>> professorTurmas(@PathVariable Integer id) {

        List<TeacherLecturesResponse> response = teacherLecturesView.getTeacherLectures(id);

        return !response.isEmpty() ? ResponseEntity.ok().body(response) : ResponseEntity.notFound().build();
    }

    @GetMapping("/horarios")
    public ResponseEntity<List<ScheduleWeekResponse>> professorHorarios(@RequestParam final Integer teacherId) {

        var response = scheduleResponse.getTeacherListSchedule(teacherId);

        return !response.isEmpty() ? ResponseEntity.ok().body(response) : ResponseEntity.notFound().build();

    }
}