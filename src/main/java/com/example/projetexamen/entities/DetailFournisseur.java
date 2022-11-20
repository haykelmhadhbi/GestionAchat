package com.example.projetexamen.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class DetailFournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFournisseur ;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaborateur;
    private String adresse;
    private String matricule ;
    @OneToOne(mappedBy="detailFournisseur", cascade = CascadeType.ALL)
    Fournisseur fournisseur;
}
