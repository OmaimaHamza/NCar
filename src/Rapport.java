import java.util.List;
public class Rapport {
    private List<Intervention> intervention;
    public Rapport(List<Intervention> interventionq) {
        this.intervention=interventionq;
    }
    public void showReport(Voiture voiture){
        int i=1;
        System.out.println("Description du voiture");
        System.out.println("Marque: "+voiture.getMarque());
        System.out.println("Matricule: "+voiture.getMatricule());
        System.out.println("Kilometrage: "+voiture.getKilometrage());
        for(Intervention intervention : this.intervention){
            if(intervention.getVoiture()==voiture){
                System.out.println("=======Les interventions======");
                System.out.println("Intervention "+i+":");
                System.out.println("Type: "+intervention.getType());
                System.out.println("Date: "+intervention.getDate());
                System.out.println("technicien: "+intervention.getTechnicien());
                i++;
            }
        }
    }
}
