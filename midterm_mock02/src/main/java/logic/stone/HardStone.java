package logic.stone;

import utils.GameUtilities;

public class HardStone extends Stone{
    protected int durability;

    public HardStone(int posX, int posY, int durability) {
        super(posX, posY);
        this.setDurability(durability);
    }

    public void dig(int digPower) {
        this.setDurability(getDurability() - digPower);
        if(durability <= 0){
            this.destroy();
        }
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = Math.max(durability, 0);
        if(durability >5) {
            this.durability = 5;
        }
    }


}
