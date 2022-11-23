package com.example.koukihoussem.services;

import com.example.koukihoussem.entities.Medecin;

import java.util.Date;

public interface IMedecinService {
    public Medecin addMedecinAssignToClinique(Medecin medecin , Long cliniqueId);
    public int getRevenuMedecin(Long idMedecin, Date startDate , Date endDate);

}
