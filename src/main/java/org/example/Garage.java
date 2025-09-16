package org.example;

import java.util.ArrayList;
import java.util.List;
public class Garage {
    private String Nom;
    private Technicien technicien;
    private String adresse;
    private Double surface;
    private List<Voiture> voiture;

    public Garage(String Nom, Technicien technicien, String adresse, Double surface) {
        this.Nom = Nom;
        this.technicien = technicien;
        this.adresse = adresse;
        this.surface = surface;
        this.voiture = new ArrayList<>();
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    public Technicien getTechnicien() {
        return technicien;
    }

    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }

}
