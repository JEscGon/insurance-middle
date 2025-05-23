package com.dev.insurance_middle.application.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {

    private Long id;

    private Long userId;
    private Long vehicleId;
    private Long beneficiaryId;

    private Long policyTypeId;

    private String iban;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate registrationDate;
    private LocalDate lastUpdateDate;
    private Boolean active;
    private Long premiumAmount;
    private List<Part> parts;

}
