package modele.pieces;

import modele.Couleur;
import modele.comportements.Attaque;
import modele.comportements.AucunDeplacement;
import modele.comportements.AucuneAttaque;
import modele.comportements.Deplacement;
import modele.utils.Coordinates;

/**
 * Created by bijou on 20/12/2016.
 */

public abstract class Piece {

    public final int NORTH = 1;
    public final int SOUTH = 2;
    public final int EAST = 3;
    public final int WEST = 4;

    protected int force;
    protected int idJoueur;
    protected Coordinates point;
    protected int deplacement;

    //protected Couleur couleur;
    protected Attaque modeAttaque = new AucuneAttaque();

    //Constructeur par défaut
    public Piece(){

    }


    public void setDeplacement(int d){
        this.deplacement = d;
    }


    //Méthode de déplacement d'une pièce
    public void seDeplacer(int direction){
        switch (direction){
            case NORTH:
                point.y += deplacement;
                break;
            case SOUTH:
                point.y -= deplacement;
                break;
            case EAST:
                point.x -= deplacement;
                break;
            case WEST:
                point.x += deplacement;
                break;
        }
    }

    public Coordinates getCoordinates(){
        return this.point;
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

    /*public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }*/

    public void setModeAttaque(Attaque modeAttaque) {
        this.modeAttaque = modeAttaque;
    }
}
