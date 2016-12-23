package modele;

import java.io.Serializable;

/**
 * Created by bijou on 20/12/2016.
 */
public class Joueur implements Serializable {

    private int idJoueur;
    private String pseudoJoueur;
    private String mdpJoueur;
    private Couleur couleur;

    private static int identifiant = 0;

    //Constructeur par défaut
    public Joueur(){

    }

    //Constructeur avec des paramètre
    public Joueur(String pseudo, String mdp){
        this.pseudoJoueur = pseudo;
        this.mdpJoueur = mdp;
        this.idJoueur = identifiant;
        this.identifiant++;
        this.couleur = null; //A l'inscription, le n'a pas encore une couleur.
    }


    /**
     * Getters et Setters
     */
    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getPseudoJoueur() {
        return pseudoJoueur;
    }

    public void setPseudoJoueur(String pseudoJoueur) {
        this.pseudoJoueur = pseudoJoueur;
    }

    public String getMdpJoueur() {
        return mdpJoueur;
    }

    public void setMdpJoueur(String mdpJoueur) {
        this.mdpJoueur = mdpJoueur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
