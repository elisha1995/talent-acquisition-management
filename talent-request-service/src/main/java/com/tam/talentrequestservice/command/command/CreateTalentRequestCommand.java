package com.tam.talentrequestservice.command.command;

import com.tam.tamscoreapi.domain.CandidateSkills;
import com.tam.tamscoreapi.domain.JobDescription;
import com.tam.tamscoreapi.domain.RequestStatus;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDate;

@Data
@Builder
public class CreateTalentRequestCommand {

    @TargetAggregateIdentifier
    private String talentRequestId;

    private String talentRequestTitle;
    private JobDescription jobDescription;
    private CandidateSkills candidateSkills;
    private RequestStatus requestStatus;
    private LocalDate startDate;
}
