public class Voiture{
    private Owner  Proprietaire;
    private String Matricule;
    private String Marque;
    private String Modele;
    private Double Kilometrage;
    public Voiture(Owner Owner,String Matricule,String Marque,String Modele,Double Kilometrage){
        this.Kilometrage=Kilometrage;this.Marque=Marque;
        this.Matricule=Matricule;this.Proprietaire=Owner;
    }
    
}