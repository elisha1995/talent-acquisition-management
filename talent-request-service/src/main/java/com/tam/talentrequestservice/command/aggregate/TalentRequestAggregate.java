package com.tam.talentrequestservice.command.aggregate;

import com.tam.tamscoreapi.domain.CandidateSkills;
import com.tam.tamscoreapi.domain.JobDescription;
import com.tam.tamscoreapi.domain.RequestStatus;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.time.LocalDate;

@Aggregate
public class TalentRequestAggregate {

    @AggregateIdentifier
    private String talentRequestId;

    private String talentRequestTitle;
    private JobDescription jobDescription;
    private CandidateSkills candidateSkills;
    private RequestStatus requestStatus;
    private LocalDate startDate;

    public TalentRequestAggregate() { /* For Axon Framework */ }
}
