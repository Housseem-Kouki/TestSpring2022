package com.example.koukihoussem.controller;

import com.example.koukihoussem.entities.Clinique;
import com.example.koukihoussem.services.ICliniqueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CliniqueController {
    ICliniqueService iCliniqueService;


    @PostMapping("/addClinique")
    @ResponseBody
    public Clinique addClinique(@RequestBody Clinique clinique){
        return  iCliniqueService.addClinique(clinique);
    }
}
