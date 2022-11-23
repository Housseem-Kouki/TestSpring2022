package com.example.koukihoussem.repository;

import com.example.koukihoussem.entities.RendezVous;
import com.example.koukihoussem.entities.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

public interface RDVRepository extends JpaRepository<RendezVous,Long> {
    @Query("SELECT  r FROM RendezVous r , Medecin m , Clinique  c where  c.idClinique =?1 and   m.specialite =?2  ")
        List<RendezVous> getRendezVousByCliniqueAndSpecialite(@PathVariable("idClinique") Long idClinique , @PathVariable("specialite")Specialite specialite);


    @Query("SELECT  r FROM RendezVous r  where r.medecin.idMedecin =?1  and r.dateRDV >=? 2 and r.dateRDV <=? 3   ")
    List<RendezVous> findRendezVousByMedecinIdMedecin(@PathVariable("idMedecin") Long idMedecin ,@PathVariable("startDate") Date startDate ,@PathVariable("startDate") Date endDate);
}
