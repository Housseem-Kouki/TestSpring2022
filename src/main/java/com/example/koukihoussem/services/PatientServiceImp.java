package com.example.koukihoussem.services;

import com.example.koukihoussem.entities.Patient;
import com.example.koukihoussem.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientServiceImp implements IPatientService{
    PatientRepository patientRepository;
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
