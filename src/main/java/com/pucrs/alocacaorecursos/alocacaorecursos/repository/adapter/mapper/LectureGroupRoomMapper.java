package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroupRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.LectureGroupRoomEntity;

public class LectureGroupRoomMapper {

    public static LectureGroupRoom mapFrom(final LectureGroupRoomEntity entity) {

        LectureGroupRoom domain = new LectureGroupRoom();

        if(Objects.nonNull(entity)) {
            domain.setRoomId(getNonNull(entity.getRoomId()));
            domain.setGroupId(getNonNull(entity.getGroupId()));

        }
        return domain;
    }

    private static Integer getNonNull(final Integer item) {
        return Objects.nonNull(item) ? item : null;
    }
    
}
