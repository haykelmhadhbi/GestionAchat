package com.example.projetexamen.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture ;
    private float montantRemise ;
    private float montantFacture ;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture ;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification  ;
    private  boolean archivee ;
    @OneToMany (mappedBy="facture", cascade = CascadeType.ALL)
    private Set<Reglement> reglements;
    @OneToMany (mappedBy="facture", cascade = CascadeType.ALL)
    private Set<DetailFacture> detailFactures;
    @ManyToOne(cascade = CascadeType.ALL)
    Fournisseur fournisseur;




}
