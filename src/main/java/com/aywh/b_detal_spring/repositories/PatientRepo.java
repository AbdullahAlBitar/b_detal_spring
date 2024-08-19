package com.aywh.b_detal_spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aywh.b_detal_spring.domain.Patient;

@Repository
public interface PatientRepo extends CrudRepository<Patient, Long>, PagingAndSortingRepository<Patient, Long> {
    
}
