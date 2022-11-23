package com.example.koukihoussem.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idMedecin;
    private String nomMedecin;
    private Specialite specialite;
    private  int telephone;
    private int prixConsultation;

    @ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private Set<Clinique> cliniques;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "medecin")
    private Set<RendezVous>  rendezVous;
}
