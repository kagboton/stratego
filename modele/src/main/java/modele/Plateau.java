package modele;

import modele.pieces.Marechal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bijou on 23/12/2016.
 */
public class Plateau implements Serializable {

    Case[][] monPlateau;
    private int idPlateau; //identifiant du plateau
    private static int identifiant = 0;
    private int idJoueur1; //identifiant du joueur qui cré le plateau
    private int idJoueur2; //identifiant du joueur qui sera invité
    public static int TAILLE = 10;

    /**
     * Getters et Setters
     */

    public Case[][] getMonPlateau() {
        return monPlateau;
    }

    public void setMonPlateau(Case[][] monPlateau) {
        this.monPlateau = monPlateau;
    }

    public int getIdPlateau() {
        return idPlateau;
    }

    public void setIdPlateau(int idPlateau) {
        this.idPlateau = idPlateau;
    }

    public int getIdJoueur1() {
        return idJoueur1;
    }

    public void setIdJoueur1(int idJoueur1) {
        this.idJoueur1 = idJoueur1;
    }

    public int getIdJoueur2() {
        return idJoueur2;
    }

    public void setIdJoueur2(int idJoueur2) {
        this.idJoueur2 = idJoueur2;
    }



    //Constructeur avec paramètres - Initialise le plateau
    public Plateau(int idJoueur){
        this.idJoueur1 = idJoueur;
        this.idPlateau = identifiant;
        identifiant++;

        //Tableau à deux dimensions d'éléments Case
        Case[][] plateauVide = new Case[TAILLE][TAILLE];
        monPlateau = plateauVide;

        //Définition des cases normales
        for (int i = 0; i < monPlateau.length; i++){
            for (int j = 0; j < monPlateau[i].length; j++){
                monPlateau[i][j] = new Case(i, j, false);
            }
        }

        //Définition des cases rivières
        monPlateau[4][2].setRiver(true);
        monPlateau[4][3].setRiver(true);
        monPlateau[5][2].setRiver(true);
        monPlateau[5][3].setRiver(true);
        monPlateau[4][6].setRiver(true);
        monPlateau[4][7].setRiver(true);
        monPlateau[5][6].setRiver(true);
        monPlateau[5][7].setRiver(true);
    }


}
