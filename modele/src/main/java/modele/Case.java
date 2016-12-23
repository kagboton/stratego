package modele;

import java.io.Serializable;

/**
 * Created by bijou on 20/12/2016.
 */
public interface Case extends Serializable {

    //Permet de savoir si la case est occupée ou non
    boolean caseOccupee();
}
