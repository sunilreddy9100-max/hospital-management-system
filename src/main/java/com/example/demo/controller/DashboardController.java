package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.repository.PatientRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.AppointmentRepository;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin
public class DashboardController {

    @Autowired
    private PatientRepository patientRepo;

    @Autowired
    private DoctorRepository doctorRepo;

    @Autowired
    private AppointmentRepository appointmentRepo;

    @GetMapping("/stats")
    public Map<String, Long> getStats(){

        Map<String, Long> stats = new HashMap<>();

        stats.put("patients", patientRepo.count());

        stats.put("doctors", doctorRepo.count());

        stats.put("appointments", appointmentRepo.count());

        return stats;

    }

}