package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LectureDTO {

    private String name;
    private String content;

}
