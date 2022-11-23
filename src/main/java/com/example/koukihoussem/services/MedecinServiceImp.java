package com.example.koukihoussem.services;

import com.example.koukihoussem.entities.Clinique;
import com.example.koukihoussem.entities.Medecin;
import com.example.koukihoussem.entities.RendezVous;
import com.example.koukihoussem.repository.CliniqueRepository;
import com.example.koukihoussem.repository.MedecinRepository;
import com.example.koukihoussem.repository.RDVRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class MedecinServiceImp implements IMedecinService {
    MedecinRepository medecinRepository;
    CliniqueRepository cliniqueRepository;

    RDVRepository rdvRepository;

    RDVServiceImp rdvServiceImp;
    @Override
    public Medecin addMedecinAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique c = cliniqueRepository.findById(cliniqueId).orElse(null);
        Set<Clinique> lc = medecin.getCliniques();
        lc.add(c);
        medecin.setCliniques(lc);
        return medecinRepository.save(medecin);
    }

    @Override
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate) {
        List<RendezVous> lr = rdvRepository.findRendezVousByMedecinIdMedecin(idMedecin , startDate,endDate);
        int nb = rdvServiceImp.getNbrRendezVousMedecin(idMedecin);
        int revenu =1;
        for(RendezVous r : lr){
            revenu = r.getMedecin().getPrixConsultation() * revenu;

        }
        return revenu;
    }
}
