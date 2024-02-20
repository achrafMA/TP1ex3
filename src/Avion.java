public class Avion extends Vehicule{
    private  String copmagnie;
    private double vitesseMax;

    public Avion() {
    }

    public Avion(String nom, double prix, String copmagnie, double vitesseMax) {
        super(nom, prix);
        this.copmagnie = copmagnie;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }
}
