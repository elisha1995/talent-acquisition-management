package com.tam.talentrequestservice.command.dto;

import com.tam.tamscoreapi.domain.RequestStatus;
import lombok.Data;

@Data
public class TalentRequestResponseDTO {

    private String talentRequestId;
    private String talentRequestTitle;
    private RequestStatus requestStatus;
}
