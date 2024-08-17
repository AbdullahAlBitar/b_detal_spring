package com.aywh.b_detal_spring.mappers.impl;

import com.aywh.b_detal_spring.domain.CasePhoto;
import com.aywh.b_detal_spring.domain.dto.CasePhotoDto;
import com.aywh.b_detal_spring.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CasePhotoMapper implements Mapper<CasePhoto, CasePhotoDto> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public CasePhotoDto mapTo(CasePhoto casePhoto) {
        return modelMapper.map(casePhoto, CasePhotoDto.class);
    }

    @Override
    public CasePhoto mapFrom(CasePhotoDto casePhotoDto) {
        return modelMapper.map(casePhotoDto, CasePhoto.class);
    }
}
