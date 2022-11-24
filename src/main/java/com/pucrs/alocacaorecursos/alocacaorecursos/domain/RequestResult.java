package com.pucrs.alocacaorecursos.alocacaorecursos.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestResult {

    private Integer requestId;
    private Boolean status;

}
