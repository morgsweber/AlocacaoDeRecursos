package com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.lecture_view.LectureViewDTO;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.LectureDTO;

import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.lecture_timeline.LectureScheduleDTO;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.weekly_schedule.LectureClassroomScheduleDTO;
public interface LecturesUserView {
    /*
     * Retorna o cronograma semanal do usuario (professor ou aluno)
     * - nome da cadeira
     * - localizacao da cadeira
     * - dias da semana 
     * - horario 
     */
    List<LectureClassroomScheduleDTO> getAllWeeklyLecturesSchedules(String userId, String startWeek, String endWeek);

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
