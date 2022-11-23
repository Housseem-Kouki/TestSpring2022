package com.example.koukihoussem.services;

import com.example.koukihoussem.entities.Clinique;
import com.example.koukihoussem.repository.CliniqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClinqueServiceImp  implements ICliniqueService{
    CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }
}
