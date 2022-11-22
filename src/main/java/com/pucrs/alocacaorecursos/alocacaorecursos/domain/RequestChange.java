package com.pucrs.alocacaorecursos.alocacaorecursos.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestChange {

    private String disciplina;
    private String nome_professor;
    private String turma;
    private String descricao;
    private String sala;
    private String laboratorio;
    private String troca;
    
}
