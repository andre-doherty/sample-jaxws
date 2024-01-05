package com.bnpp.pf.tes.demo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Person Request representing the data sent by a remote client
 */
public class PersonReq implements Serializable {

    private static final long serialVersionUID = -7730941159393388105L;

    @NotNull(message = "{CODEPIM1}")
    private String nom;

    @NotNull(message = "{CODEPIM2}")
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
