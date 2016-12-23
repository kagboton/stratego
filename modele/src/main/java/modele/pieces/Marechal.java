package modele.pieces;

import modele.comportements.AttaqueSimple;

/**
 * Created by bijou on 20/12/2016.
 */
public class Marechal extends Piece{

    public Marechal(){
        this.setForce(Piece.MARECHAL);
        this.setModeAttaque(new AttaqueSimple());
    }
}
