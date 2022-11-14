package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class ScheduleWeekResponse {

    private String lecture;
    private String building;
    private String classRoom;
    private String startHour;
    private String endHour;
    private String dayOfWeek;
    private String dayOfMonth;

}
