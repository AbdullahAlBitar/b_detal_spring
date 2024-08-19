package com.aywh.b_detal_spring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VisitDto {

    private Long id;

    private PatientDto patient;

    private DoctorDto doctor;

    private Date date;
}
