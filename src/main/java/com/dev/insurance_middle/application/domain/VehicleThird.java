package com.dev.insurance_middle.application.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleThird {

    private Long id;
    private Long userThirdId;
    private String matricula;
    private String aseguradora;
    private String color;
    private Long km;
    private String marca;
    private LocalDate fechaFabricacion;
    private LocalDate dateOfRegistration;
    private LocalDate dateOfLastUpdate;

}
