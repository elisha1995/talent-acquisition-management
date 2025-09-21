package com.tam.talentrequestservice.command.dto;

import com.tam.tamscoreapi.domain.CandidateSkills;
import com.tam.tamscoreapi.domain.JobDescription;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CreateTalentRequestCommandDTO {

    private String talentRequestTitle;
    private JobDescription jobDescription;
    private CandidateSkills candidateSkills;
    private LocalDate startDate;
}
