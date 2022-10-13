package com.pucrs.port.input;

import java.util.List;

import com.pucrs.port.Location;
import com.pucrs.port.Turma;
import com.pucrs.port.TurmaCronograma;
import com.pucrs.port.WeeklySchedule;

public interface ProfessorInterface {
    public List<WeeklySchedule> getWeeklySchedule(int professorId);

    public List<Turma> getTurmas(int professorId);

    public List<TurmaCronograma> geTurmaCronogramas(int professorId);

    public boolean trocaSala(int professorId, Location localizacaoNova, String justificativa);

    public void logOut(int professorId);
}
