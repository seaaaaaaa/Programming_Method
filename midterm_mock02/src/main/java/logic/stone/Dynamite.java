package logic.stone;

import utils.GameUtilities;

import java.util.ArrayList;

public class Dynamite extends Stone{

    public Dynamite(int posX, int posY) {
        super(posX, posY);
    }

    public void destroy(){
        GameUtilities.removeStone(this);
        ArrayList<Stone> adj = GameUtilities.getAdjacentStones(this.posX, this.posY);
        for (Stone s: adj){
            s.destroy();
        }
    }
}
