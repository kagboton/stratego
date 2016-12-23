package modele;

import modele.pieces.Piece;

/**
 * Created by bijou on 20/12/2016.
 */
public class Case{

    private int x;
    private int y;
    private boolean isRiver;
    Piece pieceDansCase;



    //Constructeur avec des paramètres
    public Case(int x, int y, boolean isRiver){
        this.x = x;
        this.y = y;
        this.isRiver = isRiver;
    }

    /**
     * Getters et Setters
     */

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isRiver() {
        return isRiver;
    }

    public void setRiver(boolean river) {
        isRiver = river;
    }

    public Piece getPieceDansCase() {
        return pieceDansCase;
    }

    public void setPieceDansCase(Piece pieceDansCase) {
        this.pieceDansCase = pieceDansCase;
    }


    //Permet de savoir si une case est occupée ou non
    public boolean caseOccupee() {
        return pieceDansCase != null;
    }
}
