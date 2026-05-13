package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Patient;
import java.util.List;

public interface PatientRepository
extends JpaRepository<Patient, Integer> {
	List<Patient> findByNameContaining(String name);
}