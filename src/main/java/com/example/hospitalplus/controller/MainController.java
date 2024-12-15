package com.example.hospitalplus.controller;

import com.example.hospitalplus.entity.Appointment;
import com.example.hospitalplus.entity.Donor;
import com.example.hospitalplus.entity.Laboratory;
import com.example.hospitalplus.service.AppService;
import com.example.hospitalplus.service.DonorService;
import com.example.hospitalplus.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private AppService appService;

    @Autowired
    private DonorService donorService;

    @Autowired
    private LabService labService;

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
        Appointment existingAppointment = appService.getAppById(id);
        existingAppointment.setFullName(appointment.getFullName());
        existingAppointment.setEmail(appointment.getEmail());
        existingAppointment.setMessage(appointment.getMessage());
        return ResponseEntity.ok(appService.updateApp(existingAppointment));
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
}
