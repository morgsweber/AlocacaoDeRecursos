package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "professor")
public class TeacherEntity {

    @Id
    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column(name = "idade")
    private int age;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "area")
    private String area;
}
