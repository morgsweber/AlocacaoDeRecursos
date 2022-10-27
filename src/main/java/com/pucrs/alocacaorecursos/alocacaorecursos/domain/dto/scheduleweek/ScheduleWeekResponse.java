package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.scheduleweek;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ScheduleWeekResponse {

    private String lecture;
    private String building;
    private String classRoom;
    private String startHour;
    private String endHour;
    private String dayOfWeek;
    private String dayOfMonth;

}
