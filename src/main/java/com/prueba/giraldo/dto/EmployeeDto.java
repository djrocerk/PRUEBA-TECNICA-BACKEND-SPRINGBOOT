package com.prueba.giraldo.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class EmployeeDto {
    private Integer id;
    private String surname;
    private String secondSurname;
    private String firstName;
    private String otherNames;
    private CountryDto country;
    private IdentificationTypeDto identificationType;
    private String identificationNumber;
    private String email;
    private Date admissionDate;
    private WorkAreaDto workArea;
    private Boolean status;
    private Timestamp createAt;
}
