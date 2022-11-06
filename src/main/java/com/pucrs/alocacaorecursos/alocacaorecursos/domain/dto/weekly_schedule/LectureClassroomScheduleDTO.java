package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class LectureClassroomScheduleDTO {
    String lectureName;
    String building;
    String classroomId;
    String startTime;
    String endTime;
    String weekday;
    String date;
}
