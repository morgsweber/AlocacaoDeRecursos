package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class RequestEntity {
    
    @Id
    @Column(name = "pedido_id")
    private Integer requestId;

    @Column(name = "professor_id")
    private Integer teacherId;

    @Column(name = "sala_id" )
    private Integer currentClassroomId;

    @Column(name = "nova_sala_id")
    private Integer newClassroomId;
    
    @Column(name = "disciplina_id")
    private Integer lectureId;

    @Column(name = "turma_id")
    private Integer lectureGroupId;

    @Column(name = "justificativa")
    private String motive;

}
