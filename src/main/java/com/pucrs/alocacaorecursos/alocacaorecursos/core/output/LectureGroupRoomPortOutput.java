package com.pucrs.alocacaorecursos.alocacaorecursos.core.output;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureGroupRoom;

public interface LectureGroupRoomPortOutput { 
    
    LectureGroupRoom getLectureGroupRoom(final String groupId);
}
