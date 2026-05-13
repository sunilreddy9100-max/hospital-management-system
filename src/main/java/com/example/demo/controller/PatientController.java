package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping("/save")
    public Patient savePatient(@RequestBody Patient p) {

        return service.savePatient(p);

    }

    @GetMapping("/all")
    public List<Patient> getAllPatients() {

        return service.getAllPatients();

    }
    @DeleteMapping("/delete/{id}")
    public String deletePatient(@PathVariable int id) {

        service.deletePatient(id);

        return "Patient Deleted Successfully";

    }
    @PutMapping("/update")
    public Patient updatePatient(@RequestBody Patient p) {

        return service.updatePatient(p);

    }
    @GetMapping("/search/{name}")
    public List<Patient> searchPatient(
            @PathVariable String name){

        return service.searchPatient(name);

    }

}