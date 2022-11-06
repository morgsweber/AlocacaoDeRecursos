package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities;

import java.io.Serializable;
import java.util.Objects;

public class EnrollId implements Serializable {

    private Integer lectureGroupId;
    private Integer studentId;

    public EnrollId() {
    }

    public EnrollId(Integer lectureGroupId, Integer studentId) {
        this.lectureGroupId = lectureGroupId;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrollId enrollId = (EnrollId) o;
        return lectureGroupId.equals(enrollId.lectureGroupId) &&
               studentId.equals(enrollId.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lectureGroupId, studentId);
    }
}
