package modele;

/**
 * Created by bijou on 20/12/2016.
 */
public enum Couleur {
    rouge("rouge"),
    bleu("bleu");

    String couleur;

    //Constructeur
    Couleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }
}
