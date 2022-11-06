package com.pucrs.alocacaorecursos.alocacaorecursos.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LectureRoom {

    private int groupId;
    private int roomId;
    private String description;
    private String scheduled;
    private LocalDateTime day;

}
