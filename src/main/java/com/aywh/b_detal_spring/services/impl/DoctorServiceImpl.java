package com.aywh.b_detal_spring.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aywh.b_detal_spring.domain.Doctor;
import com.aywh.b_detal_spring.repositories.DoctorRepo;
import com.aywh.b_detal_spring.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;


    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepo.save(doctor);
    }
}
