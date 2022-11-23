package com.example.koukihoussem.controller;


import com.example.koukihoussem.entities.Medecin;
import com.example.koukihoussem.services.IMedecinService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class MedecinController {
    IMedecinService iMedecinService;
    @PostMapping("/addMedecinAssignToClinique/{cliniqueId}")
    @ResponseBody
    public Medecin addMedecinAssignToClinique(@RequestBody Medecin medecin, @PathVariable("cliniqueId") Long cliniqueId) {
       return iMedecinService.addMedecinAssignToClinique(medecin,cliniqueId);
    }
}
