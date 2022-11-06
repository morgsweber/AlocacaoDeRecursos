package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.*;

import java.time.LocalDateTime;
import java.util.Objects;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;

public class LectureRoomMapper {
    
    public static LectureRoom mapFrom(final LectureRoomEntity entity) {
        LectureRoom domain = new LectureRoom();

        if(Objects.nonNull(entity)) {
            domain.setScheduled(getNonNull(entity.getScheduled()));
            domain.setRoomId(getNonNull(entity.getRoomId()));
            domain.setDescription(getNonNull(entity.getDescription()));
            domain.setScheduled(getNonNull(entity.getScheduled()));
            domain.setDayOfWeek(getNonNull(entity.getDayOfWeek()));
        }

        return domain;
    }

    private static String getNonNull(final String item) {
        return Objects.nonNull(item) ? item : null;
    }
    private static LocalDateTime getNonNull(final LocalDateTime item) {
        return Objects.nonNull(item) ? item : null;
    }
    private static Integer getNonNull(final Integer item) {
        return Objects.nonNull(item) ? item : null;
    }
}
