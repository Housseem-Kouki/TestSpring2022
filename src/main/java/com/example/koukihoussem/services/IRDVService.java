package com.example.koukihoussem.services;

import com.example.koukihoussem.entities.RendezVous;
import com.example.koukihoussem.entities.Specialite;

import java.util.List;

public interface IRDVService {
    public void addRDVAndAssignMedAndPatient(RendezVous rdv , Long idMedecin,Long idPatient);

    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique , Specialite specialite);


    public int getNbrRendezVousMedecin(Long idMedecin);
}
