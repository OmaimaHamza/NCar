public class Intervention{
    private String Date;
    private Voiture voiture;
    private String type;
    protected boolean estEffectue;
    private Technicien technicien;
    private Double cout;
    public boolean estEffectue(){return estEffectue=true;}
    public Intervention(String Date,Voiture voiture,Technicien technicien,double cout,String type){
        this.Date=Date;this.cout=cout;this.voiture=voiture;this.technicien=technicien;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public String getDate() {
        return Date;
    }

    public Double getCout() {
        return cout;
    }
    public Technicien getTechnicien() {
        return technicien;
    }
    public Voiture getVoiture() {
        return voiture;
    }
}
