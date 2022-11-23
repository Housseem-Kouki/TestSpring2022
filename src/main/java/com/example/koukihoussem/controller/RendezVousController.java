package com.example.koukihoussem.controller;

import com.example.koukihoussem.entities.RendezVous;
import com.example.koukihoussem.entities.Specialite;
import com.example.koukihoussem.services.IRDVService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class RendezVousController {
    IRDVService irdvService;

    @PostMapping("/addRDVAndAssignMedAndPatient/{idMedecin}/{idPatient}")
    @ResponseBody
    public void addRDVAndAssignMedAndPatient(@RequestBody RendezVous rdv, @PathVariable("idMedecin") Long idMedecin, @PathVariable("idPatient") Long idPatient) {
        irdvService.addRDVAndAssignMedAndPatient(rdv,idMedecin,idPatient);
    }


    @GetMapping("/addRDVAndAssignMedAndPatient/{idClinique}/{specialite}")
    @ResponseBody
    public void getRendezVousByCliniqueAndSpecialite(@PathVariable("idClinique") Long idClinique, @PathVariable("specialite") Specialite specialite) {
        irdvService.getRendezVousByCliniqueAndSpecialite(idClinique,specialite);
    }

}
