package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.class_room;

import java.util.Optional;
import main.java.com.pucrs.alocacaorecursos.alocacaorecursos.repository.adapter.mapper.ClassRoomMapper;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.ClassroomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.ClassRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.repository.entities.ClassRoomEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClassRoomPortOutputImpl implements ClassroomPortOutput {

    @Autowired
    private ClassRoomBase repository;

    @Override
    public ClassRoom getClassRoom(Integer id) {
        Optional<ClassRoomEntity> optional = repository.findById(id);

        if (optional.isEmpty()) {
            return null;
        }
        return ClassRoomMapper.mapFrom(optional.get());
    }
}