import java.util.List;
public class Technicien {
    private Garage garage;
    private List<Intervention> intervention;
    private String Nom;
    private String Prenom;
    public Technicien(Garage garage, String Nom, String Prenom) {
        this.garage = garage;this.Prenom=Prenom;this.Nom=Nom;
    }

}
