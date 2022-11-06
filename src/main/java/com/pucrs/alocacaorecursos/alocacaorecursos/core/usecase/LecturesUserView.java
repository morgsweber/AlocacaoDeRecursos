package com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek.ScheduleWeekResponse;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.*;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.lecture_view.LectureViewDTO;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.lecture_timeline.LectureScheduleDTO;

public interface LecturesUserView {
    /*
     * Retorna o cronograma semanal do usuario (professor ou aluno)
     * - nome da cadeira
     * - localizacao da cadeira
     * - dias da semana 
     * - horario 
     */
    List<ScheduleWeekResponse> getAllWeeklyLecturesSchedules(String userId, String startWeek, String endWeek);

    /*
     * Retorna todas as disciplinas em que o usuario esta matriculado/ministra
     * - nome da cadeira
     * - nome do professor que ministra
     * - id da turma
     */
    List<LectureViewDTO> getAllLectures(String userId);

    /*
     * Retorna o cronograma de uma disciplina em especifico
     * - datas
     * - descricao da aula naquela data
     * - localizacao
     */
    List<LectureScheduleDTO> getOneLectureSchedule(String lectureId);
}
