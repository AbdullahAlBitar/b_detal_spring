package com.aywh.b_detal_spring.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.aywh.b_detal_spring.domain.Doctor;
import com.aywh.b_detal_spring.domain.dto.DoctorDto;
import com.aywh.b_detal_spring.mappers.Mapper;
import com.aywh.b_detal_spring.services.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DoctorController {

    @Autowired
    private Mapper<Doctor, DoctorDto> docMapper;

    @Autowired
    private DoctorService doctorService;
    
    @PostMapping("/doctor")
    public DoctorDto createDoctor(@RequestBody DoctorDto doctorDto) {
        Doctor doctor = docMapper.mapFrom(doctorDto);
        doctor = doctorService.save(doctor);
        doctorDto = docMapper.mapTo(doctor);
        
        return doctorDto;
    }
    
}
