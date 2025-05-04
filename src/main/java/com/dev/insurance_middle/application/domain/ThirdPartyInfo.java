package com.dev.insurance_middle.application.domain;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ThirdPartyInfo {

  private List<ThirdPartyUser> thirdPartyUser;

  private List<ThirdPartyVehicle> thirdPartyVehicle;

}