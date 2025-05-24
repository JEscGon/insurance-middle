package com.dev.insurance_middle.application.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Part {

    private Long id;

    private Long policyId;
    private List<ThirdPartyUser> thirdPartyUsers;
    private Long stateId;

    private String placeEvent;
    private String description;

    private LocalDateTime accidentDate;
    private LocalDateTime dateOfRegistration;
    private LocalDateTime dateOfLastUpdate;
}