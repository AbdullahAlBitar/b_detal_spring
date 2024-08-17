package com.aywh.b_detal_spring.mappers.impl;

import com.aywh.b_detal_spring.domain.Visit;
import com.aywh.b_detal_spring.domain.dto.VisitDto;
import com.aywh.b_detal_spring.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VisitMapper implements Mapper<Visit, VisitDto> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public VisitDto mapTo(Visit visit) {
        return modelMapper.map(visit, VisitDto.class);
    }

    @Override
    public Visit mapFrom(VisitDto visitDto) {
        return modelMapper.map(visitDto, Visit.class);
    }
}
