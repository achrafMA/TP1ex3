public class Voiture extends Vehicule{
    private String modele;
    private int annee;

    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Le modele : "+modele+" L'annee : "+annee);
    }

    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit");
    }
}
