package com.example.hospitalplus.service;

import com.example.hospitalplus.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    List<Patient> getAllPatients();
    Patient savePatient(Patient patient);
    Patient getPatientById(Integer id);
    Patient updatePatient(Patient patient);
    void deletePatientById(Integer id);
}

