package com.aywh.b_detal_spring.mappers.impl;

import com.aywh.b_detal_spring.domain.Doctor;
import com.aywh.b_detal_spring.domain.dto.DoctorDto;
import com.aywh.b_detal_spring.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapperImpl implements Mapper<Doctor, DoctorDto> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public DoctorDto mapTo(Doctor doctor) {
        return modelMapper.map(doctor, DoctorDto.class);
    }

    @Override
    public Doctor mapFrom(DoctorDto doctorDto) {
        return modelMapper.map(doctorDto, Doctor.class);
    }
}
