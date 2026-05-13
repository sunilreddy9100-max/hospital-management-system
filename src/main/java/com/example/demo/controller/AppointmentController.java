package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
@CrossOrigin
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping("/save")
    public Appointment saveAppointment(
            @RequestBody Appointment a){

        return service.saveAppointment(a);

    }

    @GetMapping("/all")
    public List<Appointment> getAllAppointments(){

        return service.getAllAppointments();

    }

    @DeleteMapping("/delete/{id}")
    public String deleteAppointment(@PathVariable int id){

        service.deleteAppointment(id);

        return "Appointment Deleted Successfully";

    }

}