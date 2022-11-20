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
public class Operateur implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  idOperateur ;
    private String nom  ;
    private float prenom;
    private String password ;


    @OneToMany ( cascade = CascadeType.ALL)
    private Set<Facture> factures;

}
