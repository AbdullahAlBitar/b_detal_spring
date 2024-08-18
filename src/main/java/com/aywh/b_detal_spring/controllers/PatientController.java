package com.aywh.b_detal_spring.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.aywh.b_detal_spring.domain.Patient;
import com.aywh.b_detal_spring.domain.dto.PatientDto;
import com.aywh.b_detal_spring.mappers.Mapper;
import com.aywh.b_detal_spring.services.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PatientController {

    @Autowired
    private Mapper<Patient, PatientDto> patientMapper;

    @Autowired
    private PatientService patientService;
    
    @PostMapping("/patient")
    public PatientDto createPatient(@RequestBody PatientDto patientDto) {
        Patient patient = patientMapper.mapFrom(patientDto);
        patient = patientService.save(patient);
        patientDto = patientMapper.mapTo(patient);
        
        return patientDto;
    }
    
}
