package com.aywh.b_detal_spring.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aywh.b_detal_spring.domain.Patient;
import com.aywh.b_detal_spring.repositories.PatientRepo;
import com.aywh.b_detal_spring.services.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepo patientRepo;

    @Override
    public Patient save(Patient patient) {
        return patientRepo.save(patient);
    }
    
}
