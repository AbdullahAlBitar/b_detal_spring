package com.aywh.b_detal_spring.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CasePhotoDto {
    
    private Long id;
    
    private PatientDto patient;

    private String imgURL;

    private Date date;
}
