package com.dev.insurance_middle.application.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.annotation.Generated;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * ThirdPartyUser
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonTypeName("ThirdPartyUser")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ThirdPartyUser {

  private Integer id;

  private String name;

  private String surname;

  private String phone;

  private String email;

  private String dni;

  private String city;

  private String country;

  private String address;

  private LocalDate dateOfBirth;

  private LocalDate dateOfRegistration;

  private LocalDate dateOfLastUpdate;

}