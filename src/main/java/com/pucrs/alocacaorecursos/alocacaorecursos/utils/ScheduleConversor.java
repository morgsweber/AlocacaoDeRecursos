package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.utils;

import java.util.HashMap;

public class ScheduleConversor {
   private String horario;
   
   public ScheduleConversor(String horario){
    this.horario = horario;
   }

   public String getStartTime(){
    HashMap<String, String> inicioHorarios = new HashMap<String, String>();

    inicioHorarios.put("A", "08:00");
    inicioHorarios.put("B", "08:45");
    inicioHorarios.put("C", "09:45");
    inicioHorarios.put("D", "10:30");
    inicioHorarios.put("E", "11:30");
    inicioHorarios.put("E1", "12:15");
    inicioHorarios.put("F", "14:00");
    inicioHorarios.put("G", "14:45");
    inicioHorarios.put("H", "15:45");
    inicioHorarios.put("I", "16:30");
    inicioHorarios.put("J", "17:30");
    inicioHorarios.put("K", "18:15");
    inicioHorarios.put("L", "19:15");
    inicioHorarios.put("M", "20:00");
    inicioHorarios.put("N", "21:00");
    inicioHorarios.put("P", "21:45");

    return inicioHorarios.get(horario.charAt(0)+"");

   }

   public String getEndTime(){
    HashMap<String, String> fimHorarios = new HashMap<String, String>();

    fimHorarios.put("A", "08:45");
    fimHorarios.put("B", "09:30");
    fimHorarios.put("C", "10:30");
    fimHorarios.put("D", "11:15");
    fimHorarios.put("E", "12:15");
    fimHorarios.put("E1", "13:00");
    fimHorarios.put("F", "14:45");
    fimHorarios.put("G", "15:30");
    fimHorarios.put("H", "16:30");
    fimHorarios.put("I", "17:15");
    fimHorarios.put("J", "18:15");
    fimHorarios.put("K", "19:00");
    fimHorarios.put("L", "20:00");
    fimHorarios.put("M", "20:45");
    fimHorarios.put("N", "21:45");
    fimHorarios.put("P", "22:30");

    return fimHorarios.get(horario.substring(1));

   }
}
