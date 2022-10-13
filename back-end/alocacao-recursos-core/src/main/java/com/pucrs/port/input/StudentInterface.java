package com.pucrs.port.input;

import java.util.List;

import com.pucrs.port.Turma;
import com.pucrs.port.TurmaCronograma;
import com.pucrs.port.WeeklySchedule;

public interface StudentInterface {
    
    public List<WeeklySchedule> getWeeklySchedule(int studentId);

    public List<Turma> getTurmas(int studentId);

    public List<TurmaCronograma> geTurmaCronogramas(int studentId);

    public void logOut(int studentId);
}
