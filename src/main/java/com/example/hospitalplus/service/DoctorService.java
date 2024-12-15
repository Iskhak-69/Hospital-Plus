package com.example.hospitalplus.service;

import com.example.hospitalplus.entity.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor saveDoctor(Doctor doctor);
    Doctor getDoctorById(Integer id);
    Doctor updateDoctor(Doctor doctor);
    void deleteDoctorById(Integer id);
}
