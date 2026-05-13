package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping("/save")
    public Doctor saveDoctor(@RequestBody Doctor d){

        return service.saveDoctor(d);

    }

    @GetMapping("/all")
    public List<Doctor> getAllDoctors(){

        return service.getAllDoctors();

    }

    @DeleteMapping("/delete/{id}")
    public String deleteDoctor(@PathVariable int id){

        service.deleteDoctor(id);

        return "Doctor Deleted Successfully";

    }

}