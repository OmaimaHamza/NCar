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

    public Double getKilometrage() {
        return Kilometrage;
    }

    public Owner getProprietaire() {
        return Proprietaire;
    }


    public String getMatricule() {
        return Matricule;
    }

    public String getMarque() {
        return Marque;
    }
    public String getModele() {
        return Modele;
    }
}