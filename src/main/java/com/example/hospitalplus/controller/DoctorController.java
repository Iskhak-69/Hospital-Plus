package com.example.hospitalplus.controller;

import com.example.hospitalplus.entity.*;
import com.example.hospitalplus.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private AppService appService;

    @Autowired
    private DonorService donorService;

    @Autowired
    private LabService labService;

    // Dashboard Endpoint
    @GetMapping
    public ResponseEntity<String> dashboardView() {
        return ResponseEntity.ok("Welcome to Doctor Dashboard");
    }

    // Patients Endpoints
    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getAllPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    @PostMapping("/patients")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.savePatient(patient));
    }

    @PutMapping("/patients/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Integer id, @RequestBody Patient patient) {
        Patient existingPatient = patientService.getPatientById(id);
        existingPatient.setFirstName(patient.getFirstName());
        existingPatient.setLastName(patient.getLastName());
        existingPatient.setEmail(patient.getEmail());
        existingPatient.setPhone(patient.getPhone());
        existingPatient.setSex(patient.getSex());
        existingPatient.setAge(patient.getAge());
        existingPatient.setAppointment(patient.getAppointment());
        existingPatient.setDoctor(patient.getDoctor());
        return ResponseEntity.ok(patientService.updatePatient(existingPatient));
    }

    @DeleteMapping("/patients/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Integer id) {
        patientService.deletePatientById(id);
        return ResponseEntity.noContent().build();
    }

    // Appointments Endpoints
    @GetMapping("/appointments")
    public ResponseEntity<List<Appointment>> getAllAppointments() {
        return ResponseEntity.ok(appService.getAllAppointments());
    }

    @PostMapping("/appointments")
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
        return ResponseEntity.ok(appService.saveApp(appointment));
    }

    @PutMapping("/appointments/{id}")
    public ResponseEntity<Appointment> updateAppointment(@PathVariable Integer id, @RequestBody Appointment appointment) {
        Appointment existingApp = appService.getAppById(id);
        existingApp.setFullName(appointment.getFullName());
        existingApp.setEmail(appointment.getEmail());
        existingApp.setMessage(appointment.getMessage());
        return ResponseEntity.ok(appService.updateApp(existingApp));
    }

    @DeleteMapping("/appointments/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable Integer id) {
        appService.deleteAppById(id);
        return ResponseEntity.noContent().build();
    }

    // Donors Endpoints
    @GetMapping("/donors")
    public ResponseEntity<List<Donor>> getAllDonors() {
        return ResponseEntity.ok(donorService.getAllDonors());
    }

    @PostMapping("/donors")
    public ResponseEntity<Donor> createDonor(@RequestBody Donor donor) {
        return ResponseEntity.ok(donorService.saveDonor(donor));
    }

    @PutMapping("/donors/{id}")
    public ResponseEntity<Donor> updateDonor(@PathVariable Integer id, @RequestBody Donor donor) {
        Donor existingDonor = donorService.getDonorById(id);
        existingDonor.setFullName(donor.getFullName());
        existingDonor.setEmail(donor.getEmail());
        existingDonor.setMessage(donor.getMessage());
        return ResponseEntity.ok(donorService.updateDonor(existingDonor));
    }

    @DeleteMapping("/donors/{id}")
    public ResponseEntity<Void> deleteDonor(@PathVariable Integer id) {
        donorService.deleteDonorById(id);
        return ResponseEntity.noContent().build();
    }

    // Laboratories Endpoints
    @GetMapping("/laboratories")
    public ResponseEntity<List<Laboratory>> getAllLaboratories() {
        return ResponseEntity.ok(labService.getAllLabs());
    }

    @PostMapping("/laboratories")
    public ResponseEntity<Laboratory> createLaboratory(@RequestBody Laboratory laboratory) {
        return ResponseEntity.ok(labService.saveLab(laboratory));
    }

    @PutMapping("/laboratories/{id}")
    public ResponseEntity<Laboratory> updateLaboratory(@PathVariable Integer id, @RequestBody Laboratory laboratory) {
        Laboratory existingLab = labService.getLabById(id);
        existingLab.setLabName(laboratory.getLabName());
        existingLab.setAddress(laboratory.getAddress());
        existingLab.setDonor(laboratory.getDonor());
        return ResponseEntity.ok(labService.updateLab(existingLab));
    }

    @DeleteMapping("/laboratories/{id}")
    public ResponseEntity<Void> deleteLaboratory(@PathVariable Integer id) {
        labService.deleteLabById(id);
        return ResponseEntity.noContent().build();
    }
}
