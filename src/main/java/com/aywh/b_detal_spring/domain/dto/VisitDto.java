package com.aywh.b_detal_spring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

import com.aywh.b_detal_spring.domain.Doctor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VisitDto {

    private Long id;

    private PatientDto patient;

    private Doctor doctor;

    private Date date;
}
