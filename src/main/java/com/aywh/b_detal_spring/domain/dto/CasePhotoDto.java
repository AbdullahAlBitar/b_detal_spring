package com.aywh.b_detal_spring.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

import com.aywh.b_detal_spring.domain.Patient;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CasePhotoDto {
    
    private Long id;
    
    private Patient patient;

    private String imgURL;

    private Date date;
}
