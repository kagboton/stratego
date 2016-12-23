package modele.pieces;

import modele.Couleur;
import modele.comportements.Attaque;
import modele.comportements.AucunDeplacement;
import modele.comportements.AucuneAttaque;
import modele.comportements.Deplacement;

/**
 * Created by bijou on 20/12/2016.
 */
public abstract class Piece {

    protected int force;
    protected int idJoueur;
    protected Couleur couleur;
    protected Attaque modeAttaque = new AucuneAttaque();

    //Constructeur par défaut
    public Piece(){

    }

    //Méthode de déplacement d'une pièce
    public void seDeplacer(){
        
    }

    //Méthode d'attaque
    public void attaquer(){
        modeAttaque.attaque();
    }


    /**
     * Getters et Setters
     */
    public void setForce(int force) {
        this.force = force;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public void setModeAttaque(Attaque modeAttaque) {
        this.modeAttaque = modeAttaque;
    }
}
