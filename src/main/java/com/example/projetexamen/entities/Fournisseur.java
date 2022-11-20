package com.example.projetexamen.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idFournisseur ;
    private Integer codeFournisseur;
    private  String  libelleFournisseur ;
    private  CategorieFournisseur categorieFournisseur ;
    @OneToMany(mappedBy="fournisseur", cascade = CascadeType.ALL)
    private Set<Facture> factures;
    @ManyToMany( cascade = CascadeType.ALL)
    private Set<SecteurActivite> secteurActivites;
    @OneToOne( cascade = CascadeType.ALL)
    DetailFournisseur detailFournisseur;
}
