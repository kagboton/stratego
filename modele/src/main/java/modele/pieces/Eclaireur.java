package modele.pieces;

/**
 * Created by lekaizer on 23/12/2016.
 */
public class Eclaireur extends Piece {

    public Eclaireur() {
        this.setForce(Piece.ECLAIREUR);
    }

    public void move(int direction, int num_pieces){
        setDeplacement(num_pieces);
        this.seDeplacer(direction);
    }
}
