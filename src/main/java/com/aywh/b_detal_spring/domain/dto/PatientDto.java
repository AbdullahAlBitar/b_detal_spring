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
public class PatientDto {

    private Long id;

    private String name;

    private String phone;

    private Boolean sex;

    private Date birth;
}
