
public class Owner{
    String Nom;
    String Prenom;
    List<Voiture> voiture;
    public List<Vente> ventes;
    public Owner(String Nom,String Prenom){
        this.Nom=Nom;this.Prenom=Prenom;
    }
    public void removeCar(Voiture voiture,Owner NewOwner){
        for(int i=0;i<this.voiture.size();i++){
            Vente newsale=new Vente();
            if(this.voiture.get(i)==voiture){
                this.voiture.remove(i);
                addVente(newsale, voiture);   
            }
        }
    }
    void addVente(Vente newsale,Voiture voiture){
        newsale.setVoiture(voiture);
        newsale.setNewOwner(new Owner(this.Nom,this.Prenom));
        ventes.add(newsale);
    }
    public void setVoiture(Voiture voiture){
        this.voiture.add(voiture);
    }
}