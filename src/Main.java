//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Owner owner1=new Owner("Laila","Lahdili");
        Owner owner2=new Owner("Ahmed","Ahemd");
        Voiture voiture = new Voiture(owner1, "1234-أ-56", "Toyota", "Corolla", 152000.0);
        owner1.setVoiture(voiture);
        Garage garage1=new Garage("Marrakech Gueliz",30.00);
        Technicien tech1=new Technicien(garage1,"Ahmed","Ahmed");
        Intervention intervention1=new Intervention("12-09-2025",voiture,tech1,200,"Changement de vedange");
        Intervention intervention2=new Intervention("17-09-2025",voiture,tech1,200,"changement de ..");
        List<Intervention> intervention=new ArrayList<>();
        intervention.add(intervention1);
        intervention.add(intervention2);
        Rapport rapp=new Rapport(intervention);
        rapp.showReport(voiture);
    }
}