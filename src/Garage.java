
import java.util.*;
public class Garage {
    private Technicien technicien;
    private String adresse;
    private Double surface;
    private List<Voiture> voiture;
    public void addVoiture(Voiture voiture){this.voiture.add(voiture);}
    public Garage(String adresse,Double surface){
        this.adresse=adresse;
        this.surface=surface;
    }
}
