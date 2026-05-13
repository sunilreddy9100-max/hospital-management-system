package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repo;

    public Doctor saveDoctor(Doctor d){

        return repo.save(d);

    }

    public List<Doctor> getAllDoctors(){

        return repo.findAll();

    }

    public void deleteDoctor(int id){

        repo.deleteById(id);

    }

}