package modele.pieces;

import modele.comportements.AttaqueSimple;

/**
 * Created by bijou on 20/12/2016.
 */
public class Marechal extends Piece{

    private static int force = 10;

    public Marechal(){
        this.setForce(Marechal.force);
        this.setModeAttaque(new AttaqueSimple());
    }
}
