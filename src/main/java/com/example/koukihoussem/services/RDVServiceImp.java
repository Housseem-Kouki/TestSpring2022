package com.example.koukihoussem.services;

import com.example.koukihoussem.entities.Medecin;
import com.example.koukihoussem.entities.Patient;
import com.example.koukihoussem.entities.RendezVous;
import com.example.koukihoussem.entities.Specialite;
import com.example.koukihoussem.repository.MedecinRepository;
import com.example.koukihoussem.repository.PatientRepository;
import com.example.koukihoussem.repository.RDVRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RDVServiceImp implements IRDVService{
    RDVRepository rdvRepository;
    PatientRepository patientRepository;
    MedecinRepository medecinRepository;
    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Patient p = patientRepository.findById(idPatient).orElse(null);
        Medecin m = medecinRepository.findById(idMedecin).orElse(null);
        rdv.setMedecin(m);
        rdv.setPatient(p);
         rdvRepository.save(rdv);
    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return rdvRepository.getRendezVousByCliniqueAndSpecialite(idClinique,specialite);
    }

    @Override
    public int getNbrRendezVousMedecin(Long idMedecin) {
        int nbr = 0;
        List<RendezVous> lr = rdvRepository.findAll();
        for(RendezVous r : lr){
            if(r.getMedecin().getIdMedecin() == idMedecin){
                nbr ++;
            }

        }

        return nbr;
    }


}
