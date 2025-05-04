package com.dev.insurance_middle.application.domain;

import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ThirdPartyVehicle {

  private Integer id;

  private Integer userThirdId;

  private String matricula;

  private Integer km;

  private String marca;

  private String aseguradora;

  private String color;

  private LocalDate fechaFabricacion;

  private LocalDate dateOfRegistration;

  private LocalDate dateOfLastUpdate;

}