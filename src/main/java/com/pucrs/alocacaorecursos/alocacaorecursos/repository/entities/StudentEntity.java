package com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "aluno")
public class StudentEntity {
    @Id
    private String id;

    @Column(name = "nome")
    private String name;

    @Column(name = "idade")
    private int age;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "curso")
    private String course;

    @Column(name = "semestre")
    private int semester;
}
