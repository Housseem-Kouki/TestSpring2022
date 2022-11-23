package com.example.koukihoussem.repository;

import com.example.koukihoussem.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
