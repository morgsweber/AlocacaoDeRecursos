package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import java.time.LocalDateTime;
import java.util.List;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;

public interface LectureRoomPortOutput {
    
    List<LectureRoom> findLectureRoomByLectureGroupId(final Integer id);

    String getStartHour(String schedule);

    String getEndHour(String schedule);

    String getDayOfWeek(LocalDateTime data);

    String getDayOfMonth(LocalDateTime data);
}
