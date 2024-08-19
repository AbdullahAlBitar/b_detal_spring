package com.aywh.b_detal_spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aywh.b_detal_spring.domain.Patient;

public interface PatientService {
        Patient save(Patient patient);

        List<Patient> findAll();

        Page<Patient> findAll(Pageable pageable);

        Optional<Patient> findById(Long id);

        boolean exists(Long id);

        Patient update(Long id, Patient patient);

        void delete(Long id);

}
