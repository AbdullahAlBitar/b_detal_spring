package com.aywh.b_detal_spring.services.impl;


import java.util.List;
import java.util.Optional;

import java.lang.RuntimeException;

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

    @Override
    public List<Patient> findAll() {
        return (List<Patient>) patientRepo.findAll();
    }

    @Override
    public Optional<Patient> findById(Long id) {
        return patientRepo.findById(id);
    }

    @Override
    public boolean exists(Long id) {
        return patientRepo.existsById(id);
    }

    @Override
    public Patient update(Long id, Patient patient) {
        patient.setId(id);
        return patientRepo.findById(id).map(existingPatient -> {
            Optional.ofNullable(patient.getBirth()).ifPresent(existingPatient::setBirth);
            Optional.ofNullable(patient.getName()).ifPresent(existingPatient::setName);
            Optional.ofNullable(patient.getPhone()).ifPresent(existingPatient::setPhone);
            Optional.ofNullable(patient.getSex()).ifPresent(existingPatient::setSex);
            return patientRepo.save(existingPatient);
        }).orElseThrow(() -> new RuntimeException("Patient does not Exist"));
    }

    @Override
    public void delete(Long id) {
        patientRepo.deleteById(id);
    }

}
