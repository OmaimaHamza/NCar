package org.example;

public class Vente {
    private Voiture voiture;
    private Owner NewOwner;
    private Owner OldOwner;
    private String date;
    private Double prix;

    public Vente() {}
    public Vente(Voiture voiture, Owner OldOwner, Owner NewOwner, String date, Double prix) {
        this.voiture = voiture;
        this.OldOwner = OldOwner;
        this.NewOwner = NewOwner;
        this.date = date;
        this.prix = prix;
    }

    public void setVoiture(Voiture voiture){
        this.voiture=voiture;
    }
    public void setNewOwner(Owner OldOwner){
        this.OldOwner=OldOwner;
    }
}
