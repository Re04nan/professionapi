package com.dio.bootcamp.santander.profissionapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProfessionType {

    TEACHER("Teacher"),
    DEVELOPER("Developer"),
    DOCTOR("Doctor"),
    LAWYER("Lawyer"),
    COOK("Cook");

    public final String description;

}
