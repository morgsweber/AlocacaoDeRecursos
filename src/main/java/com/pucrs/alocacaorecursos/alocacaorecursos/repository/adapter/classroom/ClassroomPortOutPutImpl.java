package com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.ClassroomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.ClassRoom; 
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.ClassRoomEntity;

@Repository
public class ClassroomPortOutPutImpl implements ClassroomPortOutput {

    @Autowired
    private ClassroomBase classroomBase;

    @Override
    public ClassRoom getClassroom(String id) {
        ClassRoomEntity classroome =  classroomBase.findById(Integer.parseInt(id)).get();
        ClassRoom classroom= new ClassRoom();
        classroom.setId(classroome.getId());
        classroom.setType(classroome.getType());
        classroom.setBuilding(classroome.getBuilding());
        classroom.setCapacity(classroome.getCapacity());

        return classroom;
    }
    
}
