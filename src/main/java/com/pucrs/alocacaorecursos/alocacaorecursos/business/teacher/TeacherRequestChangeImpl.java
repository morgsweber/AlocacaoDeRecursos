package com.pucrs.alocacaorecursos.alocacaorecursos.business.teacher;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherLecturesView;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.input.TeacherRequestChange;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.RequestChangePortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.core.output.TeacherPortOutput;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherLecturesResponse;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherRequestDTO;
import com.pucrs.alocacaorecursos.alocacaorecursos.domain.dto.teacher.TeacherResponseChangeDTO;

@Component
public class TeacherRequestChangeImpl implements TeacherRequestChange {

    @Autowired
    private RequestChangePortOutput requestChangePortOutput;

    @Autowired
    private TeacherPortOutput teacherPortOutput;

    @Autowired
    private TeacherLecturesView teacherLecturesView;

    @Override
    public Optional<TeacherResponseChangeDTO> execute(final String id, final String group_id, final Map<String, String> request) {

        final List<TeacherLecturesResponse> teacherGroupList = teacherLecturesView.getTeacherLectures(id);

        final Optional<TeacherLecturesResponse> result = teacherGroupList.stream()
            .filter(item -> item.equals(group_id))
            .findFirst();

        if(result.isPresent()) {
            
        }

        final TeacherRequestDTO requestBody = new TeacherRequestDTO();
        requestBody.setRoom(request.get("sala"));
        requestBody.setJustify(request.get("justificativa"));

        TeacherResponseChangeDTO response = new TeacherResponseChangeDTO(requestBody, "solicitacao com sucesso");

        Optional<TeacherResponseChangeDTO> optionalResponse = Optional.of(response);
        return optionalResponse;
    }

    private void saveRequestInDatabase(final TeacherRequestDTO requestData) {
        
    }
    
}
