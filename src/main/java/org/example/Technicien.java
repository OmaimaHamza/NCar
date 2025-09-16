package org.example;

import java.util.ArrayList;
import java.util.List;

public class Technicien {
    private String Nom;
    private String Prenom;
    private Garage garage;
    private List<Intervention> intervention;

    public Technicien(String Nom, String Prenom, Garage garage) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.garage = garage;
        this.intervention = new ArrayList<>();
    }
    // Méthode pour ajouter une intervention
    public void ajouterIntervention(Intervention intervention) {
        this.intervention.add(intervention);
    }
}
