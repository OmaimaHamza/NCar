
public class Vente {
    private Voiture voiture;
    private Owner NewOwner;
    private Owner OldOwner;
    private String date;
    private Double prix;
    public void setVoiture(Voiture voiture){
        this.voiture=voiture;
    }
    public void setNewOwner(Owner OldOwner){
        this.OldOwner=OldOwner;
    }
}
