package com.bnpp.pf.tes.demo;
import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Person Response used when replying to the calling client.
 */
public class PersonResp implements Serializable {

    private static final long serialVersionUID = -7730941159393388105L;

    private String nom;

    private String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
