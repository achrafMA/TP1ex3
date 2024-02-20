public class Vehicule {
    private String nom;
    private double prix;
    public void emettreSon(){
        System.out.println("Le véhicule émet un son inconnu.");
    }
    public void afficherInfo(){
        System.out.println("Le nom : "+nom+" Le prix : "+ prix);
    }

    public Vehicule() {
    }

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
