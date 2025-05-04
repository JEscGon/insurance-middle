package com.dev.insurance_middle.application.domain;

import lombok.*;

import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Part {

  private Integer id;

  private Integer policyId;

  private ThirdPartyInfo thirdPartyInfo;

  private String placeEvent;

  private String description;

  private OffsetDateTime accidentDate;

  private OffsetDateTime dateOfRegistration;

  private OffsetDateTime dateOfLastUpdate;

  private Integer stateId;

}