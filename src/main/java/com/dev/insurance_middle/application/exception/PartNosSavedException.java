package com.dev.insurance_middle.application.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartNosSavedException extends RuntimeException{

    private String message;

}