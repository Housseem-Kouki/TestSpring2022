package com.example.koukihoussem.controller;


import com.example.koukihoussem.entities.Patient;
import com.example.koukihoussem.services.IPatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PatientController {

    IPatientService iPatientService;

    @PostMapping("/addPatient")
    @ResponseBody
    public Patient addPatient(@RequestBody Patient patient) {
        return iPatientService.addPatient(patient);
    }
}
