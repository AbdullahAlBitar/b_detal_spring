package com.aywh.b_detal_spring.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.aywh.b_detal_spring.domain.Patient;
import com.aywh.b_detal_spring.domain.dto.PatientDto;
import com.aywh.b_detal_spring.mappers.Mapper;
import com.aywh.b_detal_spring.services.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class PatientController {

    @Autowired
    private Mapper<Patient, PatientDto> patientMapper;

    @Autowired
    private PatientService patientService;
    
    @PostMapping("/patients")
    public ResponseEntity<PatientDto> createPatient(@RequestBody PatientDto patientDto) {
        Patient patient = patientMapper.mapFrom(patientDto);
        patient = patientService.save(patient);
        patientDto = patientMapper.mapTo(patient);
        
        return new ResponseEntity<>(patientDto, HttpStatus.CREATED);
    }

    @GetMapping("/patients")
    public Page<PatientDto> listPatient(Pageable pageable) {
        Page<Patient> patients = patientService.findAll(pageable);
        return patients.map(patientMapper::mapTo);
    }
    
    @GetMapping("/patients/{id}")
    public ResponseEntity<PatientDto> getPatient(@PathVariable Long id) {
        Optional<Patient> foundPatient = patientService.findById(id);
            return foundPatient.map(patient -> {
                PatientDto patientDto = patientMapper.mapTo(patient);
                return new ResponseEntity<>(patientDto, HttpStatus.OK);
            }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND)); 
    }
    
    @PutMapping("patients/{id}")
    public ResponseEntity<PatientDto> update(@PathVariable Long id, @RequestBody PatientDto patientDto) {
        if(!patientService.exists(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        patientDto.setId(id);
        Patient patient = patientService.save(patientMapper.mapFrom(patientDto));
        patientDto = patientMapper.mapTo(patient);
        return new ResponseEntity<>(patientDto, HttpStatus.OK);
    }
    
    @PatchMapping("patients/{id}")
    public ResponseEntity<PatientDto> partialUpdate(@PathVariable Long id, @RequestBody PatientDto patientDto) {
        if(!patientService.exists(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        patientDto.setId(id);
        Patient patient = patientService.update(id, patientMapper.mapFrom(patientDto));
        patientDto = patientMapper.mapTo(patient);
        return new ResponseEntity<>(patientDto, HttpStatus.OK);
    }
    
    @DeleteMapping("/patients/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        patientService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
