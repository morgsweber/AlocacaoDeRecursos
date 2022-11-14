package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import java.io.Serializable;
import java.util.Objects;

public class EnrollIdEntity implements Serializable {

    private Integer lectureGroupId;
    private Integer studentId;

    public EnrollIdEntity() {
    }

    public EnrollIdEntity(Integer lectureGroupId, Integer studentId) {
        this.lectureGroupId = lectureGroupId;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrollIdEntity enrollId = (EnrollIdEntity) o;
        return lectureGroupId.equals(enrollId.lectureGroupId) &&
               studentId.equals(enrollId.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lectureGroupId, studentId);
    }
}
