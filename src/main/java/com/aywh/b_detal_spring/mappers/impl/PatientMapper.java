package com.aywh.b_detal_spring.mappers.impl;

import com.aywh.b_detal_spring.domain.Patient;
import com.aywh.b_detal_spring.domain.dto.PatientDto;
import com.aywh.b_detal_spring.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper implements Mapper<Patient, PatientDto> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public PatientDto mapTo(Patient patient) {
        return modelMapper.map(patient, PatientDto.class);
    }

    @Override
    public Patient mapFrom(PatientDto patientDto) {
        return modelMapper.map(patientDto, Patient.class);
    }
}
