//Vetement.java
package com.m.vetements.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Vetement {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idVetement;
  private String nomVetement;
  private Double prixVetement;
  private Date dateCreation;
  

  @ManyToOne
  private Categorie categorie ;

  public Vetement() {
    super();
  }

  public Vetement(String nomVetement, Double prixVetement, Date dateCreation) {
    super();
    this.nomVetement = nomVetement;
    this.prixVetement = prixVetement;
    this.dateCreation = dateCreation;
  }

  public Long getIdVetement() {
    return idVetement;
  }

  public void setIdVetement(Long idVetement) {
    this.idVetement = idVetement;
  }

  public String getNomVetement() {
    return nomVetement;
  }

  public void setNomVetement(String nomVetement) {
    this.nomVetement = nomVetement;
  } 

  public Double getPrixVetement() {
    return prixVetement;
  }

  public void setPrixVetement(Double prixVetement) {
    this.prixVetement = prixVetement;
  }

  public Date getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(Date dateCreation) {
    this.dateCreation = dateCreation;
  }

  @Override
  public String toString() {
    return "Vetement [idVetement=" + idVetement + ", nomVetement=" + nomVetement + ", prixVetement=" + prixVetement
        + ", dateCreation=" + dateCreation + "]";
  }
}