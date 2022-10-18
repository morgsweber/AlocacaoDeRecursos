package main.java.com.pucrs.alocacaorecursos.core.Search;

public interface Lectures {
    /*
     * Retorna o cronograma semanal do usuario (professor ou aluno)
     * - nome da cadeira
     * - localizacao da cadeira
     * - dias da semana 
     * - horario 
     */
    List<Schedule> getAllWeeklyLecturesSchedules(int userId);

    /*
     * Retorna todas as disciplinas em que o usuario esta matriculado/ministra
     * - nome da cadeira
     * - nome do professor que ministra
     * - id da turma
     */
    List<LectureRegister> getAllLectures(int userId);

    /*
     * Retorna o cronograma de uma disciplina em especifico
     * - datas
     * - descricao da aula naquela data
     * - localizacao
     */
    List<Schedule> getOneLectureSchedule(int lectureId);
}
