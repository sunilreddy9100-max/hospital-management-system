package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repo;

    public Appointment saveAppointment(Appointment a){

        return repo.save(a);

    }

    public List<Appointment> getAllAppointments(){

        return repo.findAll();

    }

    public void deleteAppointment(int id){

        repo.deleteById(id);

    }

}