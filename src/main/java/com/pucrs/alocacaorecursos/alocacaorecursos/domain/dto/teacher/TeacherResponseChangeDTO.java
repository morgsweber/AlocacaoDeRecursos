package com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TeacherResponseChangeDTO {
    
    private String room; 
    private String justify; 
    private String status;
    
    public TeacherResponseChangeDTO(final TeacherRequestDTO request, String status) {
        this.room = request.getRoom();
        this.justify = request.getJustify();
        this.status = status;
    }
}
