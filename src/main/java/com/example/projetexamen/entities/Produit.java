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


public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;

    @OneToMany(mappedBy="produit", cascade = CascadeType.ALL)
    private Set<DetailFacture> detailFactures;
    @ManyToOne( cascade = CascadeType.ALL)
    private  Stock stock;
    @ManyToOne (cascade = CascadeType.ALL)
    CategorieProduit categorieProduit;


}
