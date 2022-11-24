package com.pucrs.alocacaorecursos.alocacaorecursos.business.teacher;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherRequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.LectureRoomPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestChangePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeachesPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.LectureRoom;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.RequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.Teaches;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherRequestDTO;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherResponseChangeDTO;

@Component
public class TeacherRequestChangeImpl implements TeacherRequestChange {

    @Autowired
    private RequestChangePortOutput requestChangePortOutput;

    @Autowired
    private TeachesPortOutput teachesPortOutput;

    @Autowired
    private LectureRoomPortOutput lectureRoomPortOutput; 

    @Override
    public Optional<TeacherResponseChangeDTO> execute(final Integer id, final Integer group_id, final Map<String, String> request) {

        final TeacherRequestDTO requestBody = new TeacherRequestDTO();

        List<Teaches> teacherGroupList = teachesPortOutput.getTeaches(id);

        List<LectureRoom> currentRoomList = lectureRoomPortOutput.findLectureRoomByLectureGroupId(group_id);
        
        Optional<LectureRoom> resultCurrentRoom = currentRoomList.stream()
            .findFirst();

        Optional<Teaches> result = teacherGroupList.stream()
            .filter(item -> item.getGroupId().equals(group_id))
            .findFirst();

        if(result.isPresent() && resultCurrentRoom.isPresent()) {
            var getData = result.get();
            var getRoom = resultCurrentRoom.get();
                      
            requestBody.setRoom(request.get("sala"));
            requestBody.setJustify(request.get("justificativa"));

            var requestChange = new RequestChange(requestBody, 
                    getData.getTeacherId(), getRoom.getRoomId(), getData.getDisciplinaId(), getData.getGroupId());

            requestChangePortOutput.save(requestChange);           

            return Optional.of(new TeacherResponseChangeDTO(requestBody, "Solicitacao efetuada com sucesso"));
        }
        
        requestBody.setRoom(request.get("sala"));
        requestBody.setJustify(request.get("justificativa"));

        return Optional.of(new TeacherResponseChangeDTO(requestBody, "Solicitacao nao efetuada."));
    }

}
