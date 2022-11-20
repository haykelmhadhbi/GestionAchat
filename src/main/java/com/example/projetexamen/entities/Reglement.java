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


public class Reglement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReglement ;
    private float montantPaye  ;
    private float montantRestant;
    private boolean payee ;

    @Temporal(TemporalType.DATE)
    private Date dateReglement ;
    @ManyToOne( cascade = CascadeType.ALL)
      Facture facture;








}
