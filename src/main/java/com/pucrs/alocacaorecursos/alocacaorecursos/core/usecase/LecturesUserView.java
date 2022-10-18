package com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase;

import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Lecture;

public interface LecturesUserView {
    /*
     * Retorna o cronograma semanal do usuario (professor ou aluno)
     * - nome da cadeira
     * - localizacao da cadeira
     * - dias da semana 
     * - horario 
     */
    List<Lecture> getAllWeeklyLecturesSchedules(int userId);

    /*
     * Retorna todas as disciplinas em que o usuario esta matriculado/ministra
     * - nome da cadeira
     * - nome do professor que ministra
     * - id da turma
     */
    List<Lecture> getAllLectures(int userId);

    /*
     * Retorna o cronograma de uma disciplina em especifico
     * - datas
     * - descricao da aula naquela data
     * - localizacao
     */
    List<Lecture> getOneLectureSchedule(int lectureId);
}
