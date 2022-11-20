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

public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock ;
    private Integer qte;
    private  Integer qteMin ;
    private  String libelleStock;
    @OneToMany(mappedBy="stock", cascade = CascadeType.ALL)
    private Set <Produit> produits;
}
