package com.tam.talentrequestservice.command.controller;

import com.tam.talentrequestservice.command.dto.CreateTalentRequestCommandDTO;
import com.tam.talentrequestservice.command.service.TalentRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("talent-request")
public class TalentRequestCommandController {

    private final TalentRequestService talentRequestService;

    public TalentRequestCommandController(TalentRequestService talentRequestService) {
        this.talentRequestService = talentRequestService;
    }

    @PostMapping
    public ResponseEntity createTalentRequest(@RequestBody CreateTalentRequestCommandDTO createTalentRequestCommandDTO) {
        return talentRequestService.createNewTalentRequest(createTalentRequestCommandDTO);
    }
}
