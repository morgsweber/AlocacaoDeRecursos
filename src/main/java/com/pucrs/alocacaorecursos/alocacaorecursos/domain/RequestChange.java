package com.pucrs.alocacaorecursos.alocacaorecursos.domain;

import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherRequestDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestChange {

    private Integer requestId;
    private Integer teacherId;
    private Integer currentClassroomId;
    private Integer newClassroomId;
    private Integer lectureId;
    private Integer lectureGroupId;
    private String motive;

    public RequestChange(final TeacherRequestDTO dto, final Integer teacherId, 
                                final Integer currentClassroomId, 
                                final Integer lectureId, 
                                final Integer lectureGroupId) {

        this.requestId = Integer.hashCode(teacherId);
        this.newClassroomId = Integer.parseInt(dto.getRoom());
        this.motive = dto.getJustify();        
        this.teacherId = teacherId;
        this.currentClassroomId = currentClassroomId;
        this.lectureId = lectureId;
        this.lectureGroupId = lectureGroupId;
    }
    
}
