package com.example.projetexamen.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture ;
    private Integer  qteCommandee ;
    private float prixRotalDetail ;

    private  Integer pourcentageRemise ;
    private float montantRemise;
    @ManyToOne( cascade = CascadeType.ALL)
    Facture facture;
    @ManyToOne( cascade = CascadeType.ALL)
    Produit produit;



}
