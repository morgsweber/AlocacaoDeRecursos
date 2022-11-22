package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "turma_sala")
public class RoomGroupEntity {
    
    @Id
    @Column(name = "turma_sala_id")
    private String groupRoomId;
    
    @Column(name = "turma_id")
    private Integer groupId;
    
    @Column(name = "sala_id")
    private Integer roomId;
    
    @Column(name = "descricao")
    private String descritption;
    
    @Column(name = "horario")
    private String schedule;
    
    @Column(name = "dia")
    private String dayOfWeek;

}
