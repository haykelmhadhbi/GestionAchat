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

public class CategorieProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorieProduit;
    private String codeProduit ;
    private  String libelleCategorieProduit;
    @OneToMany(mappedBy="categorieProduit", cascade = CascadeType.ALL)
    private Set <Produit> produis ;

}
