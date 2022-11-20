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


public class SecteurActivite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSecteurActivite ;
    private  String codeSecteurActivite;
    private  String libelleSecteurActivite;
    @ManyToMany(mappedBy="secteurActivites", cascade = CascadeType.ALL)
    private Set<Fournisseur> fournisseurs;



}
