package modele;

import modele.pieces.Piece;
import modele.utils.Coordinates;

/**
 * Created by bijou on 20/12/2016.
 */
public class CaseNormale implements Case{

    private Coordinates point;
    private boolean isRiver;
    Piece pieceDansCase;



    //Constructeur avec des paramètres
    public CaseNormale(int x, int y, boolean isRiver){
        this.point.x = x;
        this.point.y = y;
        this.isRiver = isRiver;
    }

    /**
     * Getters et Setters
     */

    public int getX() {
        return this.point.x;
    }

    public void setX(int x) {
        this.point.x = x;
    }

    public int getY() {
        return point.y;
    }

    public void setY(int y) {
        this.point.y = y;
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


    @Override
    public boolean caseOccupee() {
        return pieceDansCase != null;
    }
}
